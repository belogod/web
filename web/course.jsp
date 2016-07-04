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

           <p> <span class="price"> ГРУППА ЗАНИМАЕТСЯ:</span></p>

            <table class="table_teacher2">
            <c:forEach items="${title.courses}" var="course">
            <tr>
            <th>${course.week}</th>
            <th>${course.time}</th>

            </tr>
            </c:forEach>
            </table>
    </div>
</div>



        <span class="price"> Стоимость:</span>
        <br><p><span class="price2"> ${title.price} грн. за весь курс.</span></p>

                ${title.text}

    </div>
    <!--end wrap-->
    <ul class="post-navigation">
        <li><a href="lesson.html">&laquo; Курсы</a></li>
    </ul>
    <div id="footer">
        <p class="copyright"><img src="images/logo.png" width="50" height="25" />Для записи на курс, перейдите на страницу - <a href="contact.html">"Контакты"</a></p>
    </div>
</div>
</body>
<div class="cache-images"><img src="images/red-button-bg.png" width="0" height="0" alt="" /><img src="images/black-button-bg.png" width="0" height="0" alt="" /></div>
<!--end cache-images-->
</html>