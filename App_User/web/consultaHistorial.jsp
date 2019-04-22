<%-- 
    Document   : consultaHistorial
    Created on : 16/04/2019, 01:41:18 PM
    Author     : EdwinDavid
--%>


<%@page import="co.uniminuto.edu.ws.Apuesta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getSession().getAttribute("login") == null) {
        response.sendRedirect("index.jsp");
    }
    co.uniminuto.edu.ws.Usuariows_Service service = new co.uniminuto.edu.ws.Usuariows_Service();
    co.uniminuto.edu.ws.Usuariows port = service.getUsuariowsPort();

    co.uniminuto.edu.ws.Apuestaws_Service service2 = new co.uniminuto.edu.ws.Apuestaws_Service();
    co.uniminuto.edu.ws.Apuestaws port2 = service2.getApuestawsPort();
    java.util.List<co.uniminuto.edu.ws.Apuesta> apuestas = port2.verApuestasUsuario((int) request.getSession().getAttribute("login"));

    co.uniminuto.edu.ws.Equipows_Service service3 = new co.uniminuto.edu.ws.Equipows_Service();
    co.uniminuto.edu.ws.Equipows port3 = service3.getEquipowsPort();

    co.uniminuto.edu.ws.Partidows_Service service4 = new co.uniminuto.edu.ws.Partidows_Service();
    co.uniminuto.edu.ws.Partidows port4 = service4.getPartidowsPort();
%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Historico</title>
    </head>
    <body>
        <table width="100%" height="100%" ><tr>
                <td width="50%" >Cedula: <%out.println(request.getSession().getAttribute("login"));%> </td>
                <td width="50%" ><a href="menuUser.jsp">Inicio</a></td>
                <td width="50%" ><form action="salir" method="post"><input type="submit" value="Salir"></form></td>
            </tr></table>
        <h2><center><p>Historial Apuestas</p>
                <p>Saldo: $<%out.println(port.consultaSaldo((int) request.getSession().getAttribute("login")));%></p>
                <table border="1px solid black">
                    <tr><th>Id</th><th>Valor</th><th>Apuesta</th><th>Fecha Apuesta</th><th>Local</th><th>Visita</th><th>Fecha Partido</th><th>Resultado</th><th>Ganador</th></tr>
                            <%for (Apuesta p : apuestas) {%>
                    <tr><td><%out.print(p.getIdApuesta());%></td>
                        <td><%out.print(p.getValor());%></td>
                        <td><%out.print(p.getApuesta());%></td>
                        <td><%out.print(p.getFecha());%></td>
                        <td><%out.print(port3.consultarEquipo(port4.consultaPartido(p.getPartidoIdpartido()).getEquipoIdequipo()));%></td>
                        <td><%out.print(port3.consultarEquipo(port4.consultaPartido(p.getPartidoIdpartido()).getEquipoIdequipo1()));%></td>
                        <td><%out.print(port4.consultaPartido(p.getPartidoIdpartido()).getFecha());%></td>
                        <td><%out.print(port4.consultaPartido(p.getPartidoIdpartido()).getResultado());%></td>
                        <td><%out.print(p.getEstado() == 0 ? "No" : "Si");%></td></tr>
                        <%}%>
                </table>
            </center>
        </h2>
    </body>
</html>
