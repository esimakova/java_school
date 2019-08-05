<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title></title>
</head>
<body>

<div class="panel-body">
    <form action="doLogin" method="post">
        <fieldset>
            <legend>Please sign in</legend>

            <c:if test="${not empty error}">
                <div class="alert alert-danger">
                    <spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/>
                    <br/>
                </div>
            </c:if>
            <div class="form-group">
                <input class="form:input-large" placeholder="User Name"
                       name='username' type="text">
            </div>
            <div class="form-group">
                <input class=" form:input-large" placeholder="Password"
                       name='password' type="password" value="">
            </div>
            <input class="btn" type="submit"
                   value="Login">
        </fieldset>
    </form>
</div>
</body>
</html>