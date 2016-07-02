<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Название курсов</title>
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

    <div class="page-headline">Курсы</div>
    <div id="main">



        <%--<c:forEach var="title" items="${titles}">--%>

        <%--<table class="table_teacher2">--%>
            <%--<li><a href="course.html?ttid=${title.id}">${title.title}</a></li>--%>

     <%--</table>--%>
        <%--</c:forEach>--%>

        <c:forEach var="title" items="${titles}">
            <table class="table_title1">
                <p><th><a href="course.html?ttid=${title.id}">${title.title}</a></th></p>
            </table>
        </c:forEach>



    </div>
    <!--end wrap-->
</div>
</body>
<div class="cache-images"><img src="images/red-button-bg.png" width="0" height="0" alt="" /><img src="images/black-button-bg.png" width="0" height="0" alt="" /></div>
<!--end cache-images-->
</html>

