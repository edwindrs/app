<%-- 
    Document   : actualizaResultado
    Created on : 15/04/2019, 11:25:50 AM
    Author     : EdwinDavid
--%>
<%@page import="co.uniminuto.edu.ws.Partido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    co.uniminuto.edu.ws.Partidows_Service service = new co.uniminuto.edu.ws.Partidows_Service();
    co.uniminuto.edu.ws.Partidows port = service.getPartidowsPort();
    java.util.List<co.uniminuto.edu.ws.Partido> partidos = port.verPartidosActualizar();

    co.uniminuto.edu.ws.Equipows_Service service2 = new co.uniminuto.edu.ws.Equipows_Service();
    co.uniminuto.edu.ws.Equipows port2 = service2.getEquipowsPort();
%>
<!DOCTYPE html>   
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Resultado</title>
    </head>
    <body>
        <table width="100%" height="100%" ><tr>
                <td width="50%" >Cedula: <%out.println(request.getSession().getAttribute("login"));%> </td>
                <td width="50%" ><a href="menu.jsp">Inicio</a></td>
                <td width="50%" ><form action="salir" method="post"><input type="submit" value="Salir"></form></td>
            </tr></table>
        <h3>
            <center><p>Actualizar Partido</p>
                <form action="actualizaResultado" method="post">
                    <table border="1px solid black">
                        <td><select name="id">
                                <option value="" hidden>Partido</option>
                                <%for (Partido p : partidos) {%>
                                <option value="<%out.print(p.getIdpartido());%>"><%out.print(p.getIdpartido());%> - <%out.print(port2.consultarEquipo(p.getEquipoIdequipo()));%> vs <%out.print(port2.consultarEquipo(p.getEquipoIdequipo1()));%></option>
                                <%}%></select></td>
                        <td><select name="resultado">
                                <option value="" hidden>Resultado</option>
                                <option value="Gana Local">Gana Local</option>
                                <option value="Gana Visita">Gana Visita</option>
                                <option value="Empate">Empate</option>
                            </select></td>
                        <td><input type="submit" value = "Actualizar"></td>
                    </table>
                </form>
                <p>Listado De Patidos Para Actualizar</p>
                <table border="1px solid black">
                    <tr><td>Id Partido</td><td>Fecha</td><td>Local</td><td>Visita</td><td>Resultado</td></tr>
                    <%for (Partido p : partidos) {%>
                    <tr><td><%out.print(p.getIdpartido());%></td><td><%out.print(p.getFecha());%></td><td><%out.print(port2.consultarEquipo(p.getEquipoIdequipo()));%></td><td><%out.print(port2.consultarEquipo(p.getEquipoIdequipo1()));%></td><td><%out.print(p.getResultado());%></td></tr>
                    <%}%>
                </table>
            </center></h3>
    </body>
</html>
