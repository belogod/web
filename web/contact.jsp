
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Контакты</title>
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
    <div id="header">
        <div id="nav">
            <ul class="menu">
                <li class="current_page_item"><a href="index.html">Главная</a></li>
                <li><a href="teacher.html">Преподаватели</a></li>
                <li><a href="study.html">Расписание</a></li>
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
    <div class="page-headline">Обратная связь</div>
    <div id="main">
        <div id="contact-details">
            <h3 class="title">Связь:</h3>
            <div class="post">
                <p>Пожалуйста, воспользуйтесь формой на этой странице, чтоб связаться с нами.</p>
            </div>
            <h3>Контакты</h3>
            <h4>Телефон: <span>+38 (063) 627-66-56</span></h4>
            <h4>Email: <span>belogod@gmail.com</span></h4>
        </div>
        <!--end contact-details-->
        <div id="contact-form-container">
            <form id="contact-form" method="post" action="#">
                <fieldset>
                    <input id="form_name" type="text" name="name" value="Имя" onFocus="if(this.value=='Name'){this.value=''};" onBlur="if(this.value==''){this.value='Name'};" />
                    <input id="form_email" type="text" name="email" value="Email" onFocus="if(this.value=='Email'){this.value=''};" onBlur="if(this.value==''){this.value='Email'};" />
                    <input id="form_subject" type="text" name="subject" value="Тема" onFocus="if(this.value=='Subject'){this.value=''};" onBlur="if(this.value==''){this.value='Subject'};" />
                    <textarea id="form_message" rows="10" cols="40" name="message"></textarea>
                    <input id="form_submit" class="submit" type="submit" name="submit" value="Отправить &raquo;" />
                    <div class="hide">
                        <label>Do not fill out this field</label>
                        <input name="spam_check" type="text" value="" />
                    </div>
                </fieldset>
            </form>
        </div>
        <!--end contact-form-container-->
    </div>
    <!--end main-->

</div>
<!--end wrap-->
</body>
<div class="cache-images"><img src="images/red-button-bg.png" width="0" height="0" alt="" /><img src="images/black-button-bg.png" width="0" height="0" alt="" /></div>
<!--end cache-images-->
</html>