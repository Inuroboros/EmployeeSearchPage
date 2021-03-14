import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/main")
public class Servlet extends HttpServlet {
    ListPortfolio listPortfolio = ListPortfolio.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("Portfolio", listPortfolio.getPortfolios());
        req.getRequestDispatcher("home.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
          for (int i = 0; i < listPortfolio.getPortfolios().size(); i++) {
            out.print(listPortfolio.getPortfolios().get(i));
            req.getRequestDispatcher("/home.jsp").forward(req, resp);
            }
        out.close();
    }
}
