
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
    <jsp:include page="WEB-INF/header.jsp"/>

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


            <p><p><p>
            <div class="module">
                <iframe
                        name=""
                        src="http://maps.google.com/?ie=UTF8&amp;ll=46.967966, 31.994307&amp;spn=0.004467,0.010568&amp;z=17&amp;output=embed"
                        width="100%"
                        height="180"
                        class="wrapper" >
                    No Iframes
                </iframe>
            </div>
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