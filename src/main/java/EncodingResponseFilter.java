import javax.servlet.*;
import java.io.IOException;

public class EncodingResponseFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        resp.setCharacterEncoding("UTF-8");
        chain.doFilter(req, resp);
        System.out.println("init");
    }

    @Override
    public void destroy() {

    }
}
