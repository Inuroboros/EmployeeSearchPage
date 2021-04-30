<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create your Portfolio</title>
</head>
<body>
    <h1>Form of Portfolio</h1>
    <form action="/portfolio">
            <p>
                <label>Name: <input type="text" name="name"></label><br><br>
                <label>Date Of Birth:  <input type="date" name="birthday"></label><br><br>
                <label>Gender:  <input type="radio" name="gender" value="men"> Men
                    <input type="radio" name="gender" value="women"> Women</label><br><br>
                <label>Experience:  <input type="text" name="experience"></label><br><br>
                <label>Speciality:  <select id="speciality" name="speciality">
                        <option value="Web Designer">Web Designer</option>
                        <option value="JavaEE Programmer">JavaEE Programmer</option>
                        <option value="GoLang Developer">GoLang Developer</option>
                        <option value="HelpDesk">HelpDesk</option>
                    </select>
                </label><br><br>
                <label>Last Work Place:  <input type="text" name="lastWork"></label><br><br>
                <label><input type="submit" value="Create Portfolio"></label><br><br>
            </p>
    </form>

    <%

    %>
</body>
</html>
