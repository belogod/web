<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Главная</title>
    <meta charset="utf-8">
    <link type="text/css" rel="stylesheet" href="styles/style.css"/>
    <link type="text/css" rel="stylesheet" href="styles/skin.css"/>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.jcarousel.min.js"></script>
    <script type="text/javascript" src="js/initSlider.js"></script>
    <!--[if IE 6]>
    <script src="js/ie6-transparency.js"></script>
    <script>DD_belatedPNG.fix('#header img, #featured-section h2, #circles img, #frontpage-sidebar .read-more, .blue-bullets li, #sidebar .sidebar-button, #project-content .read-more, .more-link, #contact-form .submit, .jcarousel-skin-tango .jcarousel-next-horizontal, .jcarousel-skin-tango .jcarousel-prev-horizontal, #commentform .submit');</script>
    <style>body {
        behavior: url("styles/ie6-hover-fix.htc");
    }</style>
    <link rel="stylesheet" href="styles/ie6.css"/>
    <![endif]-->
    <!--[if IE 7]>
    <link rel="stylesheet" href="styles/ie7.css"/><![endif]-->
    <!--[if IE 8]>
    <link rel="stylesheet" href="styles/ie8.css"/><![endif]-->


</head>
<body class="home">
<div id="wrap">
    <jsp:include page="WEB-INF/header.jsp"/>
    <%--<div id="header">--%>
        <%--<div id="nav">--%>
            <%--<ul class="menu">--%>
                <%--<li class="current_page_item"><a href="index.html">Главная</a></li>--%>
                <%--<li><a href="teacher.html">Преподаватели</a></li>--%>
                <%--<li><a href="study.html">Расписание</a></li>--%>
                <%--<li><a>Обучение</a>--%>
                    <%--<ul class="sub-menu">--%>
                        <%--<li><a href="interesting.html">Это интересно</a></li>--%>
                        <%--<li><a href="slang.html">Сленг</a></li>--%>
                        <%--<li><a href="lazy_person.html">Для лентяев</a></li>--%>
                    <%--</ul>--%>
                <%--<li><a href="gallery.html">Галерея</a></li>--%>
                <%--<li><a href="reviews.html">Отзывы</a></li>--%>
                <%--<li><a href="contact.html">Контакты</a></li>--%>
            <%--</ul>--%>
        <%--</div>--%>
        <%--<!--end nav-->--%>
    <%--</div>--%>
    <%--<!--end header-->--%>
    <div id="featured-section">
        <h2>Yin and Yang</h2>
        <div id="circles"><img class="first" src="images/circle-red.png"/> <img src="images/circle-pink.png"/> <img
                src="images/circle-orange.png"/> <img src="images/circle-yellow.png"/></div>
        <!--end circles-->
        <div id="image-slider">
            <ul id="mycarousel" class="jcarousel-skin-tango">

                <c:forEach var="gallery" items="${galleries}">
                    <li><a href="gallery.html"><img width="280" height="190" src="picture/${gallery.image}" alt=""/></a>
                    </li>
                </c:forEach>

            </ul>
        </div>
        <!--end image-slider-->
    </div>
    <!--end featured-section-->
    <c:forEach items="${trainings}" var="training">
    <div id="frontpage-main">
        <div id="frontpage-content">

            <br><h3>${training.title}</h3>

            <br><ul class="blue-bullets">
                <li>${training.text}</li>

            </ul>

        </div>
        </c:forEach>
        <!--end frontpage-content-->

    </div>
    <!--end frontpage-main-->
    <div id="footer">
        <p class="copyright">Чтоб связаться с Нами, перейдите на страницу - <a href="contact.html">"Контакты"</a></p>
    </div>
    <!--end footer-->
</div>
<!--end wrap-->
</body>
<div class="cache-images"><img src="images/red-button-bg.png" width="0" height="0" alt=""/><img
        src="images/black-button-bg.png" width="0" height="0" alt=""/></div>
<!--end cache-images-->
</html>