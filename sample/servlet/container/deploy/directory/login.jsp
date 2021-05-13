<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
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
