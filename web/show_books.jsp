<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Книги</title>
    <%--<link href="../style.css" rel="stylesheet">--%>
    <%--<link href="../book_style.css" rel="stylesheet">--%>
</head>
<body>

<table border="1">
    <thead>
    <tr><th>Название</th><th>Страницы</th><th>Удалить</th></tr>
        </thead>
    <tbody>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.title}</td>
            <td>${book.pages}</td>
            <td><a href="delete.html?book_id=${book.id}">удалить</a></td>
        </tr>

    </c:forEach>
    </tbody>
</table>

</body>
</html>
