<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Login Form</h1>

<form:form action="save" method="post" modelAttribute="login">

    <form:hidden path="id"/>

    Username :
    <form:input path="username"/><br>

    Password :
    <form:password path="password"/><br>

    <input type="submit" value="Save"/>

</form:form>