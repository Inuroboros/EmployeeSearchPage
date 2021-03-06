package page;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ServiceFilter implements Filter {
    FilterConfig config;
    static int counter = 0;
    static ArrayList<String> logs = new ArrayList<String>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String construction = config.getInitParameter("construction");
        counter++;

        logs.add(servletRequest.getParameter("Portfolio"));
        if (counter == 3){
            PrintWriter out = servletResponse.getWriter();
            out.println("Total visitors = " + (counter));
            for (int i=0; i<logs.size(); i++){
                out.println(logs.get(i));
            }
            out.close();
        }else{
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
