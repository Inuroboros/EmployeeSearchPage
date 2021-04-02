<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <h1>Login to site</h1>
        <form action="/login" method="post">
            <p>
                <label>Username: <input type="text" name="username"></label><br><br>
                <label>Password:  <input type="password" name="password"></label><br><br>
                <label><input type="submit" value="Log in"></label><br><br>
            </p>

        </form>
    </body>
</html>
