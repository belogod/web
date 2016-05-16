<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="header">
    <div id="nav">
        <ul class="menu">
            <c:choose>
            <c:when test="${sp==\"index\"}"> <li class="current_page_item"> </c:when>
                <c:otherwise> <li> </c:otherwise>
            </c:choose>
                <a href="index.html">Главная</a></li>
            <%--<li class="current_page_item"><a href="index.html">Главная</a></li>--%>
            <c:choose>
            <c:when test="${sp==\"teacher\"}">
            <li class="current_page_item">
                </c:when>
                <c:otherwise>
            <li>
                </c:otherwise>
                </c:choose>
                <a href="teacher.html">Преподаватели</a></li>
                <c:choose>
                <c:when test="${sp==\"study\"}">
                <li class="current_page_item">
                    </c:when>
                    <c:otherwise>
                <li>
                    </c:otherwise>
                    </c:choose>
                        <a href="study.html">Расписание</a></li>
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
