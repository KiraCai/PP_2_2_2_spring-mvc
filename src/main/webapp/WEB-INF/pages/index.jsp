<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Gestion de Clients des AMIS</title>
</head>
<body>
<h1>Gestion de Clients des AMIS</h1>

<h2><a href="new">Nouveau Customer</a></h2>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>E-mail</th>
        <th>Address</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${listCustomer}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.email}</td>
            <td>${customer.adresse}</td>
            <td>
                <a href="edit?id=${customer.id}">Edit</a>
                <a href="delete?id=${customer.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>