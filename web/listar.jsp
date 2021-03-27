<%-- 
    Document   : listar
    Created on : 25-mar-2021, 16:43:20
    Author     : Erik
--%>

<%@page import="java.util.List"%>
<%@page import="model.Persona"%>
<%@page import="model.Data"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    </head>
    <body>


        <%-- 
            
          <input type="text" id="buscar"  onkeyup="function()" required>
        --%>

        <input type="text" id="txtBuscar" onkeyup="buscar()" >

        <div id="resultado"></div>   
        <script src="js/jquery-3.2.1.min.js"></script>

        <script>



            function buscar() {
          
                var txtFiltro = $("#txtBuscar").val();


                $.ajax({
                    url: "listar3.do",
                    data: {
                        filtro: txtFiltro
                    },
                    success: function (result) {
                        $("#resultado").html(result);


                    }
                });

            }



        </script>



        <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>



</html>
