/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniminuto.edu.servlets;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author EdwinDavid
 */
public class realizarApuesta extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String apuesta = request.getParameter("apuesta");
            Integer valor = Integer.parseInt(request.getParameter("valor"));
            String fecha = request.getParameter("fecha") + ":00";
            Byte estado = 0;
            int usuarioIdusuario = (int) request.getSession().getAttribute("login");
            Integer partidoIdpartido = Integer.parseInt(request.getParameter("idpartido"));
            if (consultaSaldo(usuarioIdusuario) >= valor) {
                crearApuesta(apuesta, valor, fecha, estado, usuarioIdusuario, partidoIdpartido);
                restarValor(usuarioIdusuario, valor);
                response.sendRedirect("menuUser.jsp");
            } else {
                response.sendRedirect("realizaApuesta.jsp");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static void crearApuesta(java.lang.String apuesta, int valor, java.lang.String fecha, byte estado, int idusuario, int idpartido) {
        co.uniminuto.edu.ws.Apuestaws_Service service = new co.uniminuto.edu.ws.Apuestaws_Service();
        co.uniminuto.edu.ws.Apuestaws port = service.getApuestawsPort();
        port.crearApuesta(apuesta, valor, fecha, estado, idusuario, idpartido);
    }

    private static Integer consultaSaldo(int idusuario) {
        co.uniminuto.edu.ws.Usuariows_Service service = new co.uniminuto.edu.ws.Usuariows_Service();
        co.uniminuto.edu.ws.Usuariows port = service.getUsuariowsPort();
        return port.consultaSaldo(idusuario);
    }

    private static void restarValor(int idusuario, java.lang.Integer valor) {
        co.uniminuto.edu.ws.Usuariows_Service service = new co.uniminuto.edu.ws.Usuariows_Service();
        co.uniminuto.edu.ws.Usuariows port = service.getUsuariowsPort();
        port.restarValor(idusuario, valor);
    }

    

}
