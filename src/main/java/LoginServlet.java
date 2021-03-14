import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    EmployeeList employeeList = EmployeeList.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String username=req.getParameter("username");
        String password=req.getParameter("password");

        Employee employee = employeeList.findEmployee(username);
        if(employee.getUsername().equals(username) && employee.getPassword().equals(password)){
            Cookie ck = new Cookie("username", username);
            resp.addCookie(ck);
            resp.sendRedirect("/home.jsp");
        } else{
            out.print("Incorrect username or password");
        }
        out.close();
    }
}  