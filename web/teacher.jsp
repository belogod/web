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
            <li><a href="gallery.html">Галерея</a></li>
            <li><a href="reviews.html">Отзывы</a></li>
            <li><a href="contact.html">Контакты</a></li>
        </ul>
    </div>
    <!--end nav-->
</div>
    <!--end header-->

    <div class="page-headline">Преподаватели</div>
    <div id="main">
        <%--<table>--%>

            <%--<tbody>--%>
            <%--<c:forEach var="teacher" items="${teachers}">--%>
                <%--<tr>--%>
                    <%--<td>--%>
                        <%--<a href="teacher_resume.html?tid=${teacher.id}">--%>
                        <%--<img src="img/${teacher.pictureFileName}" alt="${teacher.pictureFileName}"/>--%>
                        <%--</a>--%>
                    <%--</td>--%>
                    <%--<td class="teacher-lastname">${teacher.lastName}<br/>${teacher.name}<br/>--%>
                    <%--<img src="images/phone.png"> ${teacher.phone}--%>
                    <%--<br>${teacher.email}</td>--%>
                <%--</tr>--%>
        <%--&lt;%&ndash;<div class="portfolio-item"> <a href="teacher_resume.html"><img width="280" height="190" src="images/280x190.gif" alt="" /></a> </div>&ndash;%&gt;--%>
            <%--</c:forEach>--%>
            <%--</tbody>--%>
        <%--</table>--%>



            <c:forEach var="teacher" items="${teachers}">
            <p></p><table class="table_price">

    <caption>${teacher.lastName} ${teacher.name}<br></caption>
                <tr>
                    <td><img src="img/${teacher.pictureFileName}" alt="${teacher.pictureFileName}"/>
                    <p><br><a href="teacher_resume.html?tid=${teacher.id}">Просмотреть резюме</a></td>
                    <td id="about">Дата рождения : ${teacher.age}
                    <br>${teacher.phone}
                    <br>${teacher.email}</td>
                </tr>

            </table>
            </c:forEach>

    </div>
<!--end wrap-->
    </div>
</body>
<div class="cache-images"><img src="images/red-button-bg.png" width="0" height="0" alt="" /><img src="images/black-button-bg.png" width="0" height="0" alt="" /></div>
<!--end cache-images-->
</html>
