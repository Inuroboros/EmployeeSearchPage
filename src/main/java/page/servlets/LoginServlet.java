package page.servlets;

import page.DB.DBConnection;
import page.entity.Employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").include(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String username=req.getParameter("username");
        String password=req.getParameter("password");

        Connection connection = DBConnection.getConnection();
        Statement statement = null;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery( "Select * FROM EMPLOYEES WHERE username like '" + username +"';" );

            Employee employee = null;
            while (resultSet.next()){
                employee = new Employee(
                        resultSet.getInt( "id" ),
                        resultSet.getString("username"),
                        resultSet.getString("email"),
                        resultSet.getString("password"));



            }
            if (employee!=null){
                if (password.equals(employee.getPassword())){
                    session.setAttribute("employee", employee);
                    getServletContext().getRequestDispatcher("/home.jsp").forward(req,resp);
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        resp.sendRedirect("/login.jsp");
    }
}  