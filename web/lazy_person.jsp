<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Для лентяев</title>
    <meta charset="utf-8">
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

    <div class="page-headline">Для лентяев</div>
    <div id="main">
        <div class="lazy"> <img src="images/lazy.jpg"></div>

        <%--  Извлекаем из БД  Таблица: training --%>
            <c:forEach items="${trainings}" var="training">

                <p><h3 class="post-title"><c:out value="<a href=\"${training.url}\">${training.title}</a>" escapeXml="false" /></h3></p>
                <p><c:out value="<img  src=\"picture/${training.picture} \""  escapeXml="false"  /></p>
                <p><div class="idiom3"> <c:out value="${training.text}" escapeXml="false" /></div></p>
                <div class="post-line"></div>
            </c:forEach>




    </div>
    <ul class="post-navigation">
        <li><a href="idioms.html">&laquo; Идиомы</a></li>

        <li><a href="slang.html">&laquo; Слэнг</a></li>
    </ul>
</div>

</body>
<div class="cache-images"><img src="images/red-button-bg.png" width="0" height="0" alt="" /><img src="images/black-button-bg.png" width="0" height="0" alt="" /></div>
<!--end cache-images-->
</html>