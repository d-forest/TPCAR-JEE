<%-- 
    Document   : mockup
    Created on : 13 avr. 2015, 18:41:51
    Author     : Dylan Forest et Mahieddine Yaker
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mockup Data Generated</title>
    </head>
    <body>
        <h1>You've successfully generated you're mockup data!</h1>
        <table class="table">
            <tr>
                    <th>Title</th>
                    <th>Author</th>
                    <th>Year</th>
            </tr>
            <c:forEach var="book" items="${ books }">
            <tr>
                    <td>${ book.titre }</td>
                    <td>${ book.auteur }</td>
                    <td>${ book.annee }</td>
            </tr>
            </c:forEach>
        </table><br />
    <a href="index.jsp">get back to home page</a>
    </body>
</html>
