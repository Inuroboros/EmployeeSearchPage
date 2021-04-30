<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Registration</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
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
