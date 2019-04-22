<%-- 
    Document   : menu
    Created on : 10/04/2019, 11:32:06 PM
    Author     : EdwinDavid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body>
        <table width="100%" height="100%" ><tr>
                <td width="50%" >Cedula: <%out.println(request.getSession().getAttribute("login"));%> </td>
                <td width="50%" ><a href="menu.jsp">Inicio</a></td>
                <td width="50%" ><form action="salir" method="post"><input type="submit" value="Salir"></form></td>
            </tr></table>
        <h2><center><p>Menu Administrador</p>
                <table border="1px solid black">
                    <tr><td width="50%"><a href="crearDeporte.jsp">Crear Deporte</a></td><td width="50%"><a href="crearEquipo.jsp">Crear Equipos</a></td></tr>
                    <tr><td width="50%"><a href="crearPartido.jsp">Crear Partido</a></td><td width="50%"><a href="actualizaResultado.jsp">Actualizar Resultado</a></td></tr>
                </table>
            </center>
        </h2>
    </body>
</html>
