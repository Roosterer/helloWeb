package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by gaokuo on 2018/2/8.
 */
public class WebXmlElementTest extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("#####doGet:WebXmlElementTest#####");

        //测试<display-name>标签
        String displayName = this.getServletContext().getServletContextName();
        System.out.println("displayName:"+displayName);

        //测试应用内参数
        String contextParam = this.getServletContext().getInitParameter("sex");
        System.out.println("displayName:"+contextParam);

        //测试应用内参数
        String servletParam = this.getServletConfig().getInitParameter("age");
        System.out.println("servletParam:"+servletParam);

        req.getRequestDispatcher("index.html").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost:WebXmlElementTest");
    }
}
