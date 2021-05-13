<%--suppress ALL --%>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="login.jsp"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="EmployeeList" %>
<%@ page import="Employee" %>

<html>
<head>


<form action="/login">
    <%
        EmployeeList employeeList = EmployeeList.getInstance();
        response.setContentType("text/html");

        String username=request.getParameter("username");
        String password=request.getParameter("password");

        Employee employee = employeeList.findEmployee(username);
        if(employee.getUsername().equals(username) && employee.getPassword().equals(password)){
            Cookie ck = new Cookie("username", username);
            response.addCookie(ck);
            response.sendRedirect("/home.jsp");
        } else{
            out.print("Incorrect username or password");
        }
        out.close();
    %>
</form>


</head>
<body>

</body>
</html>
