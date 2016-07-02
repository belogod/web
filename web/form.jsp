<%--
  Created by IntelliJ IDEA.
  User: Belogod
  Date: 02.07.2016
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="web/styles/style.css"/>
    <title>Form</title>
</head>
<body>

<form accept-charset="UTF-8" action="#" class="pro-form" id="pro-form" method="post">

    <h1>Progress Form</h1>

    <div class="progress-wrap">
        <progress max="100" value="0" id="progress"></progress>
        <div class="progress-message" id="progress-message">The form, it wants you.</div>
    </div>

    <input id="subscription_plan_id" name="subscription[plan_id]" type="hidden" value="1">

    <input id="subscription_stripe_card_token" name="subscription[stripe_card_token]" type="hidden">

    <div class="field">
        <label for="card_name">Name on Card</label>
        <br>
        <input id="card_name" required="required" type="text">
    </div>

    <div class="field">
        <label for="card_address_1">Street Address</label>
        <br>
        <input id="card_address_1" required="required" type="text">
        <input id="card_address_2" type="text">
    </div>

    <div class="field">
        <label for="card_zip">Zip Code</label>
        <br>
        <input id="card_zip" maxlength="10" pattern="[0-9]*" required="required" type="text">
    </div>

    <div class="field">
        <label for="card_number">Credit Card Number</label>
        <br>
        <input id="card_number" pattern="[0-9]*" required="required" type="number">
    </div>

    <div class="field">
        <label for="card_code">Security Code on Card (CVV)</label>
        <br>
        <input id="card_code" required="required" type="text">
    </div>

    <div class="field">
        <label for="card_month">Card Expiration</label>
        <br>
        <select id="card_month">
            <option value="1">1 - January</option>
            <option value="2">2 - February</option>
            <option value="3">3 - March</option>
            <option value="4">4 - April</option>
            <option value="5">5 - May</option>
            <option value="6">6 - June</option>
            <option value="7">7 - July</option>
            <option value="8">8 - August</option>
            <option value="9">9 - September</option>
            <option value="10">10 - October</option>
            <option value="11">11 - November</option>
            <option value="12">12 - December</option>
        </select>

        <select id="card_year">
            <option value="2012">2012</option>
            <option value="2013">2013</option>
            <option value="2014">2014</option>
            <option value="2015">2015</option>
            <option value="2016">2016</option>
            <option value="2017">2017</option>
            <option value="2018">2018</option>
            <option value="2019">2019</option>
            <option value="2020">2020</option>
            <option value="2021">2021</option>
            <option value="2022">2022</option>
            <option value="2023">2023</option>
            <option value="2024">2024</option>
            <option value="2025">2025</option>
            <option value="2026">2026</option>
            <option value="2027">2027</option>
        </select>

    </div>

    <div class="actions">

        <input name="commit" type="submit" value="Subscribe" class="button">
    </div>

</form>
</body>
</html>
