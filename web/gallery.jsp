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
    <jsp:include page="WEB-INF/header.jsp"/>

    <div class="page-headline">Галерея</div>


    <div id="wrapper">

        <div id="main" class="clearfix">

            <h1>Преподаватели:</h1>

            <ul id="pageTabs">
                <li class="selected"><a rel="all" href="#">All</a></li>

                <c:forEach var="name" items="${names}">
                    <li><a rel="${name}" href="#">${name}</a></li>
                </c:forEach>

            </ul>

            <ul class="work fullWork clearfix">

                <c:forEach var="gallery" items="${galleries}">

                    <li id="id1" class="${gallery.teacher.name}"><a href="picture/${gallery.img}" class="gallery" rel="1" title="${gallery.comment}"><img src="picture/${gallery.image}" alt=""/></a>
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