<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Liste Logins</h1>

<a href="new">Nouveau Login</a>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Action</th>
    </tr>

    <c:forEach items="${logins}" var="l">
        <tr>
            <td>${l.id}</td>
            <td>${l.username}</td>
            <td>
                <a href="edit?id=${l.id}">Edit</a>
                <a href="delete?id=${l.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>

</table>