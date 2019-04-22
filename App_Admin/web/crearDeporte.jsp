<%-- 
    Document   : crearDeporte
    Created on : 11/04/2019, 12:01:37 AM
    Author     : EdwinDavid
--%>

<%@page import="co.uniminuto.edu.ws.Deporte"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    co.uniminuto.edu.ws.Deportews_Service service = new co.uniminuto.edu.ws.Deportews_Service();
    co.uniminuto.edu.ws.Deportews port = service.getDeportewsPort();
    java.util.List<co.uniminuto.edu.ws.Deporte> result = port.verDeportes();
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Deporte</title>
    </head>
    <body>
        <table width="100%" height="100%" ><tr>
                <td width="50%" >Cedula: <%out.println(request.getSession().getAttribute("login"));%> </td>
                <td width="50%" ><a href="menu.jsp">Inicio</a></td>
                <td width="50%" ><form action="salir" method="post"><input type="submit" value="Salir"></form></td>
            </tr></table>
        <h3>
            <center><p>Crear Deportes</p>
                <form action="crearDeporte" method="post"><table>
                        <tr><td>Ingrese el Deporte </td>
                            <td><input type="text" name= "deporte"></td>
                            <td><input type="submit" value = "Crear"></td></tr>
                    </table></form>
                <p>Listado De deportes Creados</p>
                <table border="1px solid black">
                    <tr><td> Id Deporte </td><td> Deporte </td></tr>
                    <%for(Deporte p :result){%>
                    <tr><td><%out.print(p.getIddeporte());%></td><td><%out.print(p.getDeporte());%></td></tr>
                    <%}%>
                </table>
            </center></h3></body>
</html>
