<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create your Portfolio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
</head>
<body>
    <h1>Form of Portfolio</h1>
    <form action="/portfolio" method="POST">
            <p>
                <label>Name: <input type="text" name="name"></label><br><br>
                <label>Date Of Birth:  <input type="date" name="birthday"></label><br><br>
                <label>Gender:  <input type="text" name="gender"></label><br><br>
                <label>Experience:  <input type="text" name="experience"></label><br><br>
                <label>Speciality:  <input type="text" name="speciality"></label><br><br>
                <label>Last Work Place:  <input type="text" name="lastWork"></label><br><br>
                <label><input type="submit" value="Create Portfolio"></label><br><br>
            </p>
    </form>

    <%

    %>
</body>
</html>
