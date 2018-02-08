package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by gaokuo on 2018/2/8.
 */
public class LifeCircle extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("#####doGet:LifeCircle#####");
        req.getRequestDispatcher("index.html").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("#####doPost:LifeCircle#####");
    }

    @Override
    public void destroy() {
        System.out.println("#####destroy:LifeCircle#####");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("#####init:LifeCircle#####");
    }
}
