<%-- 
    Document   : index
    Created on : 13 avr. 2015, 18:48:35
    Author     : Dylan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to you !</h1>
        <p>We only have few books, but the best of them !
        What ? someone is telling me they are free !</p>
        
        <div id="content">
            <fieldset>
                <legend>Take the command ! come on, don't be shy !</legend>
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
            </fieldset>
            
            <div class="link form">
                <form action="addBook" method="post">
			<fieldset>
				<legend>No books on this store ? lets add some !</legend>
				<p>
					<label for="title">Title</label>
					<input type="text" name="title" value=""> 
				</p>
				<p>
					<label for="author">Author</label> 
					<input type="text" name="author" value=""> 
				</p>
				<p>
					<label for="date">Year</label> 
					<input type="date" name="date" value="">
				</p>
				<input type="submit" value="Send"> 
			</fieldset>
		</form>
            </div>
            
            <div class="link form">
                <form action="Mockup" method="post">
                    No time to add them ? 
                    Mockup data available here, trust me, those are GREAT books -> <input type="submit" value="click me!"/>
                </form>
            </div>
        </div>
    </body>
</html>
