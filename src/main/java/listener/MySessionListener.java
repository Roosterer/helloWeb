package listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by gaokuo on 2018/2/8.
 */
public class MySessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("sessionCreated:MySessionListener");
    }
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("sessionDestroyed:MySessionListener");
    }
}
