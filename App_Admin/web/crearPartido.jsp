<%-- 
    Document   : crearPartido
    Created on : 14/04/2019, 12:39:20 AM
    Author     : EdwinDavid
--%>

<%@page import="co.uniminuto.edu.ws.Partido"%>
<%@page import="co.uniminuto.edu.ws.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    co.uniminuto.edu.ws.Equipows_Service service = new co.uniminuto.edu.ws.Equipows_Service();
    co.uniminuto.edu.ws.Equipows port = service.getEquipowsPort();
    java.util.List<co.uniminuto.edu.ws.Equipo> equipos = port.verEquipos();

    co.uniminuto.edu.ws.Partidows_Service service2 = new co.uniminuto.edu.ws.Partidows_Service();
    co.uniminuto.edu.ws.Partidows port2 = service2.getPartidowsPort();
    java.util.List<co.uniminuto.edu.ws.Partido> partidos = port2.verPartidos();

    co.uniminuto.edu.ws.Equipows_Service service3 = new co.uniminuto.edu.ws.Equipows_Service();
    co.uniminuto.edu.ws.Equipows port3 = service3.getEquipowsPort();

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Partido</title>
    </head>
    <body>
        <table width="100%" height="100%" ><tr>
                <td width="50%" >Cedula: <%out.println(request.getSession().getAttribute("login"));%> </td>
                <td width="50%" ><a href="menu.jsp">Inicio</a></td>
                <td width="50%" ><form action="salir" method="post"><input type="submit" value="Salir"></form></td>
            </tr></table>
        <h3>
            <center><p>Crear Partido</p>
                <form action="crearPartido" method="post"><table>
                        <tr><td>Fecha </td>
                            <td><input type="datetime-local" name="fecha" required></td>
                            <td>Local </td>
                            <td><select name="local">
                                    <option value="" hidden>Seleccionar Local</option>
                                    <%for (Equipo p : equipos) {%>
                                    <option value="<%out.print(p.getIdequipo());%>"><%out.print(p.getEquipo());%></option>
                                    <%}%></select></td>
                            <td>Visita </td>
                            <td><select name="visita">
                                    <option value="" hidden>Seleccionar Visita</option>
                                    <%for (Equipo e : equipos) {%>
                                    <option value="<%out.print(e.getIdequipo());%>"><%out.print(e.getEquipo());%></option>
                                    <%}%></select></td>
                            <td><input type="submit" value = "Crear"></td></tr>
                    </table></form>
                <p>Listado De Patidos Creados</p>
                <table border="1px solid black">
                    <tr><td>Id Partido</td><td>Fecha</td><td>Local</td><td>Visita</td><td>Resultado</td></tr>
                    <%for (Partido p : partidos) {%>
                    <tr><td><%out.print(p.getIdpartido());%></td><td><%out.print(p.getFecha());%></td><td><%out.print(port3.consultarEquipo(p.getEquipoIdequipo()));%></td><td><%out.print(port3.consultarEquipo(p.getEquipoIdequipo1()));%></td><td><%out.print(p.getResultado());%></td></tr>
                    <%}%>
                </table>
            </center></h3>
    </body>
</html>
