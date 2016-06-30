<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Курсы</title>
    <link type="text/css" rel="stylesheet" href="styles/style.css" />
    <!--[if IE 6]>
    <script src="js/ie6-transparency.js"></script>
    <script>DD_belatedPNG.fix('#header img, #featured-section h2, #circles img, #frontpage-sidebar .read-more, .blue-bullets li, #sidebar .sidebar-button, #project-content .read-more, .more-link, #contact-form .submit, .jcarousel-skin-tango .jcarousel-next-horizontal, .jcarousel-skin-tango .jcarousel-prev-horizontal, #commentform .submit');</script>
    <style>body { behavior: url("styles/ie6-hover-fix.htc"); }</style>
    <link rel="stylesheet" href="styles/ie6.css" />
    <![endif]-->
    <!--[if IE 7]><link rel="stylesheet" href="styles/ie7.css" /><![endif]-->
    <!--[if IE 8]><link rel="stylesheet" href="styles/ie8.css" /><![endif]-->

</head>
<body class="page">
<div id="wrap">
    <jsp:include page="WEB-INF/header.jsp"/>


    <div class="page-headline">${title.title}</div>
    <div id="main">



        <div id="content">
        <div class="post">
            <table class="table_teacher2">
            <p><tr>
            <th>День недели</th>
            <th>Время</th>

            </tr>
            <c:forEach items="${title.courses}" var="course">
            <tr>
            <td>${course.week}</td>
            <td>${course.time}</td>

            </tr>
            </c:forEach>
            </table>
    </div>
</div>


        <div id="sidebar">
            <div id="hire">
                <table class="table_teacher2">
                <p><tr>
                <th>Цена</th>
                <th>Текст</th>

                </tr>
                <c:forEach items="${title.courses}" var="course">
                <tr>
                <td>${course.price}</td>
                <td>${course.text}</td>

                </tr>
                </c:forEach>
                </table>
            </div>
            <!--end recent-projects-->
        </div>



        <%--<table class="table_teacher2">--%>
            <%--<p><tr>--%>
                <%--<th>День недели</th>--%>
                <%--<th>Время</th>--%>

            <%--</tr>--%>
                <%--<c:forEach items="${title.courses}" var="course">--%>
                <%--<tr>--%>
                    <%--<td>${course.week}</td>--%>
                    <%--<td>${course.time}</td>--%>

                <%--</tr>--%>
                <%--</c:forEach>--%>
        <%--</table>--%>

        <%--<table class="table_teacher2">--%>
            <%--<p><tr>--%>
                <%--<th>Цена</th>--%>
                <%--<th>Текст</th>--%>

            <%--</tr>--%>
                <%--<c:forEach items="${title.courses}" var="course">--%>
                <%--<tr>--%>
                    <%--<td>${course.price}</td>--%>
                    <%--<td>${course.text}</td>--%>

                <%--</tr>--%>
                <%--</c:forEach>--%>
        <%--</table>--%>


    </div>
    <!--end wrap-->
</div>
</body>
<div class="cache-images"><img src="images/red-button-bg.png" width="0" height="0" alt="" /><img src="images/black-button-bg.png" width="0" height="0" alt="" /></div>
<!--end cache-images-->
</html>