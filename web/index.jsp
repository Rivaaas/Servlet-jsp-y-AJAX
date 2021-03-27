<%-- 
    Document   : index
    Created on : 25-mar-2021, 16:03:13
    Author     : Erik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>OlA</title>
    </head>
    <body>
        <h1>Registro</h1>



        <form action="registrar.do" method="Post">

            <input type="text" id="nombre" name="txtNombre" placeholder="Nombre">
            <br><br>
            <input type="text" name="txtEdad" placeholder="Edad">
            <br><br>
            <input type="text" name="txtCorreo"placeholder="Correo">
            <br> <br>
            <input type="submit" name="Registrar" class="waves-effect waves-light btn">

            
        </form>
        
        
        <a href="listar.jsp">Listar jugadores</a>
        
        
         <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>
