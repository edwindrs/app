<%-- 
    Document   : registro
    Created on : 9/04/2019, 11:47:01 AM
    Author     : EdwinDavid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
    <center>
        <p><h2>Registro de Usuario</h2  ></p>
    <form action="registro" method="post">
        <table>
            <tr><td>Nombres:</td><td><input type="text" name= "nombres" required></td></tr>
            <tr><td>Apellidos:</td><td><input type="text" name= "apellido" required></td></tr>
            <tr><td>Cedula:</td><td><input type="text" name= "cedula" required></td></tr>
            <tr><td>Contraseña:</td><td><input type="password" name= "password" required></td></tr>
            <tr><td>Telefono</td><td><input type="text" name= "telefono" required></td></tr>
            <tr><td>Correo:</td><td><input type="text" name= "correo" required></td></tr>
            <tr><td><p align="center"><a href="index.jsp">Regresar</a></p><td><p align="center"><input type="submit" value="Registrar"></p></td></tr>
        </table>
    </form>
</center>
</body>
</html>
