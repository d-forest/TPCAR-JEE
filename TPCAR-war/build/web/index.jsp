<%-- 
    Document   : index
    Created on : 13 avr. 2015, 18:48:35
    Author     : Dylan Forest et Mahieddine Yaker
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
                            <th>Delete</th>
                            <th>Add to cart</th>
                    </tr>
                    <c:forEach var="book" items="${ books }">
                    <tr>
                            <td>${ book.titre }</td>
                            <td>${ book.auteur }</td>
                            <td>${ book.annee }</td>
                            <td><form action="deleteBook" method="post">
                                    <input type="hidden" name="titreDel" value="${ book.titre }"/>
                                    <input type="submit" value="X"/>
                                </form></td>
                            <td>
                                <c:set var="incart" scope="session" value="0"/>
                                <c:forEach var="cartBook" items="${ cart }">
                                    <c:if test="${ cartBook.titre eq book.titre }">
                                        <c:set var="incart" scope="session" value="1"/>
                                    </c:if>
                                </c:forEach>
                                <c:choose>
                                    <c:when test="${ incart == '1' }">
                                        <form action="addToCart" method="post">
                                            <input type="hidden" name="choice" value="remove"/>
                                            <input type="hidden" name="titreToCart" value="${ book.titre }"/>
                                            <input type="submit" value="Remove from the cart"/>
                                        </form> 
                                    </c:when>
                                    <c:otherwise>
                                        <form action="addToCart" method="post">
                                            <input type="hidden" name="choice" value="add"/>
                                            <input type="hidden" name="titreToCart" value="${ book.titre }"/>
                                            <input type="submit" value="Buy me!"/>
                                        </form> 
                                    </c:otherwise>
                                </c:choose>
                            </td>
                    </tr>
                    </c:forEach>
                </table><br />
                <form action="validateCart" method="post">
                    <input type="submit" value="process validate cart"/>
                </form>
            </fieldset>

            <div class="link form">
                <form action="addBook" method="post">
			<fieldset>
				<legend>No books on this store ? lets add some !</legend>
				<p>
					<label for="titre">Title</label>
					<input type="text" name="titre" value=""> 
				</p>
				<p>
					<label for="auteur">Author</label> 
					<input type="text" name="auteur" value=""> 
				</p>
				<p>
					<label for="annee">Year</label> 
                                        <input type="number" name="annee" value="">
				</p>
				<input type="submit" value="Add it !"> 
			</fieldset>
		</form>
            </div>
            
            <div class="link form">
                <form action="Mockup" method="post">
                    No time to add them ? 
                    Mockup data available here, trust me, those are GREAT books :-D <input type="submit" value="click me!"/>
                </form>
            </div>
        </div>
    </body>
</html>
