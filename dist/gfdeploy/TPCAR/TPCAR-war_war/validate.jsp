<%-- 
    Document   : validate
    Created on : 14 avr. 2015, 01:06:20
    Author     : Dylan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validate cart</title>
    </head>
    <body>
        <h1>Congratulation! those books are now yours!</h1>
        <table class="table">
            <tr>
                <th>Command</th>
                <th>Title</th>
                <th>Author</th>
                <th>Year</th>
            </tr>
            <c:forEach var="book" items="${ cart }">
            <tr>
                    <td>${ command }</td>
                    <td>${ book.titre }</td>
                    <td>${ book.auteur }</td>
                    <td>${ book.annee }</td>
            </tr>
            </c:forEach>
        </table><br />
    <a href="index.jsp">get back to home page</a>
    </body>
</html>
