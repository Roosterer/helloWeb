package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by gaokuo on 2018/2/8.
 */
public class Index extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("#####doPost:Index#####");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("#####doGet:Index#####");
        //do my test
        this.getServletContext().setAttribute("p1","add param");
        this.getServletContext().setAttribute("p1","add pppp");
        this.getServletContext().removeAttribute("p1");

        HttpSession session = request.getSession();
        session.setAttribute("mySession","this is a session");
        session.removeAttribute("mySession");

        request.getRequestDispatcher("index.html").forward(request,response);
    }
}
