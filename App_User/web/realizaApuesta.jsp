<%-- 
    Document   : realizaApuesta
    Created on : 16/04/2019, 01:40:46 PM
    Author     : EdwinDavid
--%>
<%@page import="co.uniminuto.edu.ws.Partido"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getSession().getAttribute("login") == null) {
        response.sendRedirect("index.jsp");
    }
    Date date = new Date();
    DateFormat datef = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    String fecha = datef.format(date);

    co.uniminuto.edu.ws.Usuariows_Service service = new co.uniminuto.edu.ws.Usuariows_Service();
    co.uniminuto.edu.ws.Usuariows port = service.getUsuariowsPort();

    co.uniminuto.edu.ws.Partidows_Service service2 = new co.uniminuto.edu.ws.Partidows_Service();
    co.uniminuto.edu.ws.Partidows port2 = service2.getPartidowsPort();
    java.util.List<co.uniminuto.edu.ws.Partido> partidos = port2.verPartidosApostar();

    co.uniminuto.edu.ws.Equipows_Service service3 = new co.uniminuto.edu.ws.Equipows_Service();
    co.uniminuto.edu.ws.Equipows port3 = service3.getEquipowsPort();

%> 
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Realizar Apuesta</title>
    </head>
    <body>
        <table width="100%" height="100%" ><tr>
                <td width="50%" >Cedula: <%out.println(request.getSession().getAttribute("login"));%> </td>
                <td width="50%" ><a href="menuUser.jsp">Inicio</a></td>
                <td width="50%" ><form action="salir" method="post"><input type="submit" value="Salir"></form></td>
            </tr></table>
        <h2><center><p>Realizar Apuesta</p>
                <p>Saldo: $ <%out.println(port.consultaSaldo((int) request.getSession().getAttribute("login")));%></p>
                <form action="realizarApuesta" method="post">
                    <table border="1px solid black">
                        <tr><td><select name="idpartido">
                                    <option value="" hidden>Seleccionar Partido</option>
                                    <%for (Partido p : partidos) {%>
                                    <option value="<%out.print(p.getIdpartido());%>"><%out.print(p.getFecha());%> - <%out.print(port3.consultarEquipo(p.getEquipoIdequipo()));%> vs <%out.print(port3.consultarEquipo(p.getEquipoIdequipo1()));%></option>
                                    <%}%></select></td>
                            <td><select name="apuesta">
                                    <option value="" hidden>Apuesta</option>
                                    <option value="Gana Local">Gana Local</option>
                                    <option value="Gana Visita">Gana Visita</option>
                                    <option value="Empate">Empate</option>
                                </select></td></tr>
                        <tr><td colspan="2">Valor Apuesta: <input type="numer" name= "valor" required></td></tr>
                    </table>
                    <input type="datetime-local" name="fecha" hidden value="<%out.print(fecha);%>" >                          
                    <input type="submit" value = "Apostar">
                </form>
                <p>Listado De Patidos Para Apostar</p>
                <table border="1px solid black">
                    <tr><th>Local</th><th>Visita</th><th>Fecha Hora</th><th>Resultado</th></tr>
                            <%for (Partido p : partidos) {%>
                    <tr><td><%out.print(port3.consultarEquipo(p.getEquipoIdequipo()));%></td>
                        <td><%out.print(port3.consultarEquipo(p.getEquipoIdequipo1()));%></td>
                        <td><%out.print(p.getFecha());%></td>
                        <td><%out.print(p.getResultado());%></td></tr>
                        <%}%>
                </table>
            </center>
        </h2>
    </body>
</html>
