<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Резюме</title>
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


    <div class="page-headline"></div>
    <div id="main">


            <table class="table_teacher">

            <caption>${teacher.lastName} ${teacher.name}<br></caption>
            <tr>
                <td><img width="240" height="240" src="img/${teacher.pictureFileName}" alt="${teacher.pictureFileName}"/></td>
                <td id="about">Age : ${teacher.age}
                    <br><img src="images/phone.png"> ${teacher.phone}
                    <br><img src="images/E-Mail.png"> ${teacher.email}</td>
            </tr>

        </table>


        <table class="table_teacher2">
            <p><tr>
                <th>Дата</th>
                <th>Род занятий</th>

            </tr>
            <c:forEach items="${teacher.experiences}" var="experience">
            <tr>
                <td><fmt:formatDate value="${experience.date}" pattern="dd MMMM yyyy"/></td>
                <td>${experience.text}</td>

            </tr>
            </c:forEach>
        </table>


    </div>
    <ul class="post-navigation">
        <li><a href="teacher.html">&laquo; Преподаватели</a></li>
    </ul>
    <!--end wrap-->
</div>
</body>
<div class="cache-images"><img src="images/red-button-bg.png" width="0" height="0" alt="" /><img src="images/black-button-bg.png" width="0" height="0" alt="" /></div>
<!--end cache-images-->
</html>