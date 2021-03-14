import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/portfolio")
public class PortfolioServlet extends HttpServlet {
    ListPortfolio listPortfolio = ListPortfolio.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("portfolio.jsp").include(req, resp);
        req.setAttribute("Portfolio", listPortfolio.getPortfolios());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();

        String name = req.getParameter("name");
        String Birthday = req.getParameter("birthday");
        String Gender = req.getParameter("gender");
        String experience = req.getParameter("experience");
        String speciality = req.getParameter("speciality");
        String lastWork = req.getParameter("lastWork");

        Cookie[] ck = req.getCookies();
        String username = "username";
        Cookie cookie = null;
        if(ck != null) {
            for(Cookie c: ck) {
                if(username.equals(c.getName())) {
                    cookie = c;
                    break;
                }
            }
        }
        try {
            username = cookie.getValue();
            Portfolio portfolio = new Portfolio(name, Birthday, Gender, experience, speciality, lastWork, username);
            listPortfolio.AddPortfolio(portfolio);
            resp.sendRedirect("/main");
        }
        finally {
            out.close();
        }
    }
}
