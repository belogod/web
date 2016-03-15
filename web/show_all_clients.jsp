<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Клиенты</title>
    <%--<link href="style.css" rel="stylesheet">--%>
</head>
<body>
    <table border="1">
        <thead>
        <tr><th>Фамилия</th><th>Имя</th><th>Телефон</th><th>E-mail</th></tr>
        </thead>
        <tbody>
            <c:forEach var="client" items="${clients}">
                <tr><td>${client.lastName}</td><td>${client.name}</td><td>${client.phone}</td><td>${client.email}</td></tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>
