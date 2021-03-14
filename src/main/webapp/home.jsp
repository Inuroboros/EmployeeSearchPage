<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>HH.kz</title>
    </head>
    <body>
        <div>
            <h1>Workers Place #1!</h1>
            <a href="/logout">Logout</a><br>
            <a href="/portfolio">Create Portfolio</a><br>
        </div>
        <div>
            <h2>How to start looking for a job? </h2>
            <p>hh.kz is a service that helps to find a job and select personnel in Kazakhstan! Create a resume and apply for vacancies. <a href="/portfolio">Start Searching Jobs</a></p>
        </div>
        Portfolios:<br>
        <%out.println(request.getAttribute("Portfolio"));%>
    </body>
</html>
