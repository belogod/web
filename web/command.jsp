<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Наша команда</title>
    <%--<meta charset="utf-8">--%>
    <link type="text/css" rel="stylesheet" href="styles/style.css"/>
    <%--<!--[if IE 6]>--%>
    <script src="js/ie6-transparency.js"></script>
    <script>DD_belatedPNG.fix('#header img, #featured-section h2, #circles img, #frontpage-sidebar .read-more, .blue-bullets li, #sidebar .sidebar-button, #project-content .read-more, .more-link, #contact-form .submit, .jcarousel-skin-tango .jcarousel-next-horizontal, .jcarousel-skin-tango .jcarousel-prev-horizontal, #commentform .submit');</script>
    <link rel="stylesheet" href="styles/ie6.css"/>

    <link rel="stylesheet" href="styles/ie7.css"/>
    <link rel="stylesheet" href="styles/ie8.css"/>


    <link rel="stylesheet" type="text/css" href="styles/clearfix.css">
    <link rel="stylesheet" type="text/css" href="styles/jquery.fancybox-1.3.1.css" media="screen">
    <link rel="stylesheet" type="text/css" href="styles/base.css">
    <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>


</head>
<body class="page">
<div id="wrap">
    <div id="header">
        <div id="nav">
            <ul class="menu">
                <li class="current_page_item"><a href="index.html">Главная</a></li>
                <li><a href="teacher.html">Преподаватели</a></li>
                <li><a href="study.html">Расписание</a></li>
                <li><a>Обучение</a>
                    <ul class="sub-menu">
                        <li><a href="interesting.html">Это интересно</a></li>
                        <li><a href="slang.html">Сленг</a></li>
                        <li><a href="lazy_person.html">Для лентяев</a></li>
                    </ul>
                <li><a href="command.html">Наша команда</a></li>
                <li><a href="reviews.html">Отзывы</a></li>
                <li><a href="contact.html">Контакты</a></li>
            </ul>
        </div>
        <!--end nav-->
    </div>
    <!--end header-->
    <div class="page-headline">Портфолио</div>


    <div id="wrapper">

        <div id="main" class="clearfix">

            <h1>Преподаватели:</h1>

            <ul id="pageTabs">
                <li class="selected"><a rel="all" href="#">All</a></li>

                <c:forEach var="command" items="${commands}">
                    <li><a rel="${command.teacher.name}" href="#">${command.teacher.name}</a></li>
                </c:forEach>

            </ul>

            <ul class="work fullWork clearfix">

                <c:forEach var="command" items="${commands}">

                    <li id="id1" class="${command.teacher.name}"><a href="picture/${command.img}" class="gallery"
                                                                    rel="1" title="${command.comment}"><img src="picture/${command.image}" alt=""/></a>
                    </li>

                </c:forEach>
            </ul>


        </div><!-- #main -->

    </div>

</div><!-- #wrapper -->


<script type="text/javascript" src="js/jquery.livequery.js"></script>
<script type="text/javascript" src="js/jquery-animate-css-rotate-scale.js"></script>
<script type="text/javascript" src="js/jquery.fancybox-1.3.1.pack.js"></script>
<script type="text/javascript" src="js/jquery.quicksand.min.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/base.js"></script>

</body>
</html>