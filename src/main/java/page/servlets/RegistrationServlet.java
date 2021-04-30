package page.servlets;

import page.DB.DBConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("registration.jsp").include(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String password2 = req.getParameter( "password2" );

        if (!password.equals(password2)){
            resp.sendRedirect("/registration.jsp");
        }else{
            Connection connection = DBConnection.getConnection();
            int rows = 0;
            PreparedStatement preparedStatement = null;

            try {
                preparedStatement = connection.prepareStatement("INSERT INTO Employees (username, email, password) " + "VALUES (?, ?, ?);");
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, email);
                preparedStatement.setString(3, password);
                preparedStatement.executeUpdate();

                if (rows > 0){
                    System.out.println("User created!");
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        req.getRequestDispatcher("/login.jsp");
    }
}