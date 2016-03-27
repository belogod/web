<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Преподаватели</title>
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
    <div id="header"> <img src="images/logo.png" />
        <div id="nav">
            <ul class="menu">
                <li class="current_page_item"><a href="index.html">Главная</a></li>
                <li><a href="teacher.html">Преподаватели</a></li>
                <li><a href="study.html">Занятия</a></li>
                <li><a href="">Обучение</a>
                    <ul class="sub-menu">
                        <li><a href="interesting.html">Это интересно</a></li>
                        <li><a href="slang.html">Сленг</a></li>
                        <li><a href="lazy_person.html">Для лентяенв</a></li>
                    </ul>
                <li><a href="command.html">Наша команда</a></li>
                <li><a href="reviews.html">Отзывы</a></li>
                <li><a href="contact.html">Контакты</a></li>
            </ul>
        </div>
        <!--end nav-->
    </div>
    <!--end header-->
    <div class="page-headline">Преподаватели</div>
    <div id="main">






    <table>
        <tr><th>Фамилия</th><th>Имя</th><th>Телефон</th><th>Язык</th></tr>
        <c:forEach var="teacher" items="${teachers}">

        <tr><td>${teacher.lastName}</td><td>${teacher.name}</td><td>${teacher.phone}</td><td></td></tr>
        </c:forEach>


    </table>

</div>
<!--end wrap-->
    </div>
</body>
<div class="cache-images"><img src="images/red-button-bg.png" width="0" height="0" alt="" /><img src="images/black-button-bg.png" width="0" height="0" alt="" /></div>
<!--end cache-images-->
</html>
