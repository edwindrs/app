<%-- 
    Document   : index
    Created on : 9/04/2019, 11:37:57 AM
    Author     : EdwinDavid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
    <center><p>APPUESTAS</p>
        <form action="login" method="post">
            <table>
                <tr><td><H3>Cedula:</td><td><input type="text" name= "cedula"></td></tr>
                <tr><td><H3>Contraseña:</td><td><input type="password" name= "password"></td></tr>
                <tr><td><p align="center"><input type="submit" value = "Ingresar"></p></td><td><p align="center"><a href="registro.jsp">Registrar</a></p></td></tr>
            </table>
        </form>
    </center>
</body>
</html>
