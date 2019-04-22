<%-- 
    Document   : crearEquipo
    Created on : 11/04/2019, 12:10:19 AM
    Author     : EdwinDavid
--%>

<%@page import="co.uniminuto.edu.ws.Deporte"%>
<%@page import="co.uniminuto.edu.ws.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>    
<%
    co.uniminuto.edu.ws.Equipows_Service service = new co.uniminuto.edu.ws.Equipows_Service();
    co.uniminuto.edu.ws.Equipows port = service.getEquipowsPort();
    java.util.List<co.uniminuto.edu.ws.Equipo> equipos = port.verEquipos();
    
    co.uniminuto.edu.ws.Deportews_Service service2 = new co.uniminuto.edu.ws.Deportews_Service();
    co.uniminuto.edu.ws.Deportews port2 = service2.getDeportewsPort();
    java.util.List<co.uniminuto.edu.ws.Deporte> deportes = port2.verDeportes();
    
    co.uniminuto.edu.ws.Deportews_Service service3 = new co.uniminuto.edu.ws.Deportews_Service();
    co.uniminuto.edu.ws.Deportews port3 = service3.getDeportewsPort();
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Equipo</title>
    </head>
    <body>
        <table width="100%" height="100%" ><tr>
                <td width="50%" >Cedula: <%out.println(request.getSession().getAttribute("login"));%> </td>
                <td width="50%" ><a href="menu.jsp">Inicio</a></td>
                <td width="50%" ><form action="salir" method="post"><input type="submit" value="Salir"></form></td>
            </tr></table>
        <H3>
            <center><p>Crear Equipos</p>
                <form action="crearEquipo" method="post"><table>
                        <tr><td>Ingrese el Equipo: </td>
                            <td><input type="text" name= "equipo"></td>
                            <td><select name="iddeporte">
                                    <option value="">Seleccionar Deporte..</option>
                                    <%for (Deporte p : deportes) {%>
                                    <option value="<%out.print(p.getIddeporte());%>"><%out.print(p.getDeporte());%></option>
                                    <%}%></select></td>
                            <td><input type="submit" value = "Crear"></td></tr>
                    </table></form>
                <p>Listado De Equipos Creados</p>
                <table border="1px solid black">
                    <tr><td> Id Equipo </td><td> Nombre Equipo </td><td> Deporte </td></tr>
                    <%for (Equipo e : equipos) {%>
                    <tr><td><%out.print(e.getIdequipo());%></td><td><%out.print(e.getEquipo());%></td><td><%out.print(port3.consultaDeporte(e.getDeporteIddeporte()));%></td></tr>
                    <%}%>
                </table>
            </center></H3></body>
</html>
