<%-- 
    Document   : menuUser
    Created on : 10/04/2019, 11:32:06 PM
    Author     : EdwinDavid
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if (request.getSession().getAttribute("login") == null) {
        response.sendRedirect("index.jsp");
    } else {
        co.uniminuto.edu.ws.Usuariows_Service service = new co.uniminuto.edu.ws.Usuariows_Service();
        co.uniminuto.edu.ws.Usuariows port = service.getUsuariowsPort();
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Usuario</title>
    </head>
    <body>
        <table width="100%" height="100%" ><tr>
                <td width="50%" >Cedula: <%out.println(request.getSession().getAttribute("login"));%> </td>
                <td width="50%" ><a href="menuUser.jsp">Inicio</a></td>
                <td width="50%" ><form action="salir" method="post"><input type="submit" value="Salir"></form></td>
            </tr></table>
        <h2><center><p>Menu Usuario</p>
                <p>Saldo: $<%out.println(port.consultaSaldo((int) request.getSession().getAttribute("login")));%></p>
                <table border="1px solid black">
                    <tr><td width="50%"><a href="realizaApuesta.jsp">Realizar Apuesta</a></td><td width="50%"><a href="consultaHistorial.jsp">Consulta Historial</a></td></tr>
                </table>
            </center>
        </h2>
    </body>
</html>
<%}%>