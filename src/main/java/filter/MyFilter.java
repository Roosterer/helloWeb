package filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by gaokuo on 2018/2/9.
 */
public class MyFilter implements Filter {
    public void destroy() {
        System.out.println("我的过滤器：destroy");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("我的过滤器：doFilter");
        //do，根据session获取用户的登录状态，决定是否继续执行，还是从定向到指定页面
        //因为没有filter.do的处理，所以给它重定向到index.html页面
        req.getRequestDispatcher("/index.html").forward(req,resp);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("我的过滤器：init");
    }

}
