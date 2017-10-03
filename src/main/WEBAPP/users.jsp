<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
    <head>
        <title>Users</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="./css/normalize.css" rel="stylesheet">
        <link href="./css/skeleton.css" rel="stylesheet">
        <link href="./css/style.css" rel="stylesheet">
    </head>
    <body class="container">
        <h5>Users</h5>
        <ul>
        <jsp:useBean id="userDB" class="net.brianjlee.servletjsp2.DataAccessObject" />
        <c:set var="users" value="${userDB.users}" />
        <c:forEach var="user" items="${users}">
            <li>${user.id}: ${user.firstName} ${user.lastName} - ${user.formattedPhoneNumber}</li>
        </c:forEach>
        </ul>

        <form></form>
    </body>
</html>