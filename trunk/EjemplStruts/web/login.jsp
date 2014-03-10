<%-- 
    Document   : login
    Created on : 15-feb-2013, 8:55:13
    Author     : rcerrato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EJEMPLO VALIDACION USUARIO CON STRUTS</h1>
        <html:form action="login">
        Introduce nombre: <html:text property="nombre" ></html:text><html:submit title="Buscar"></html:submit>
        <html:errors property="nombreObligatorio"></html:errors>
        </html:form>
        <html:errors property="noAutorizado" ></html:errors>
        </body>
</html:html>
