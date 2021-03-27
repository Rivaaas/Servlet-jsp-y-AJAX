<%-- 
    Document   : ver
    Created on : 27-03-2021, 2:06:02
    Author     : rivaa
--%>

<%@page import="model.Persona"%>
<%@page import="model.Data"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos </h1>
        
        
        
        
        <%
        
            String id = request.getParameter("id");
            

            Data d = new Data();
            

            Persona p = d.getPersona(id);
            

            
        
        %>
        
        <h1><%= p.getNombre() %></h1>
        
        
        <h1><%= p.getEdad()%></h1>
    </body>
</html>
