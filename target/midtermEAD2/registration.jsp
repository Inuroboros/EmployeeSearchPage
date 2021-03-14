<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Нужен ли сервлет для этой страницы???--%>
<html>
    <head>
        <title>Registration</title>
    </head>
    <body>
        <h1>Registration to site</h1>
        <form action="/registration" method="POST">
            <p>
                <label>Username: <input type="text" name="username"></label><br><br>
                <label>Email: <input type="text" name="email"></label><br><br>
                <label>Password:  <input type="password" name="password"></label><br><br>
                <label>Confirm password:  <input type="password" name="password2"></label><br><br>
                <label><input type="submit" value="Sign Up"></label><br><br>
                <label>Have an account?<a href="/login"> Click here</a></label>
            </p>
        </form>
    </body>
</html>
