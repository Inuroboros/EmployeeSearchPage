package page.servlets;

import page.DB.DBConnection;
import page.entity.Employee;
import page.entity.Portfolio;
import page.Exception.Exception;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/portfolio")
public class PortfolioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher( "portfolio.jsp" ).include( req, resp );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Employee employee = (Employee) session.getAttribute( "employee" );

        if (employee != null) {
        String name = req.getParameter( "name" );
        String Birthday = req.getParameter( "birthday" );
        String Gender = req.getParameter( "gender" );
        String experience = req.getParameter( "experience" );
        String speciality = req.getParameter( "speciality" );
        String lastWork = req.getParameter( "lastWork" );

        if ((name != null && !name.equals( "" )) &&
                (Birthday != null && !Birthday.equals( "" )) &&
                (Gender != null && !Gender.equals( "" )) &&
                (experience != null && !experience.equals( "" )) &&
                (speciality != null && !speciality.equals( "" )) &&
                (lastWork != null && !lastWork.equals( "" ))) {
            Portfolio portfolio = new Portfolio( name, Birthday, Gender, experience, speciality, lastWork );

            if (Integer.parseInt(experience) < 0){
                throw new Exception("Incorrect number");
            }

            try {
                Connection connection = DBConnection.getConnection();
                Statement statement = null;
                statement = connection.createStatement();
                System.out.println("sdfdsfdsfdsk");

                PreparedStatement preSt = connection.prepareStatement( "INSERT INTO Portfolios(name, Birthday, Gender, experience, speciality, lastWork)" +
                        "VALUES (?,"+ portfolio.getBirthday() +","+ portfolio.getGender()+","+ portfolio.getExperience() +","+ portfolio.getSpeciality() +","+portfolio.getLastWork()+");"
                );

                preSt.setString( 1, portfolio.getName() );
                System.out.println("sdfk");
                int rows = 0;
                rows = preSt.executeUpdate();
                System.out.println("sdsfdsdggfk");

                if (rows > 0) {
                    System.out.println( "Portfolio created" );
                    session.setAttribute( "CreatedPortfolio", portfolio );
                }

                getServletContext().getRequestDispatcher( "/portfolio.jsp" ).forward( req, resp );
                System.out.println("sdasfgrehfdfk");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        }
        resp.sendRedirect("/main");
    }
}
