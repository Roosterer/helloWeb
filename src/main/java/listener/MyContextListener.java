package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * Created by gaokuo on 2018/2/8.
 */
public class MyContextListener implements ServletContextAttributeListener{

    public void attributeAdded(ServletContextAttributeEvent scab) {
        System.out.println("attributeAdded:MyContextListener");
    }

    public void attributeRemoved(ServletContextAttributeEvent scab) {
        System.out.println("attributeRemoved:MyContextListener");
    }

    public void attributeReplaced(ServletContextAttributeEvent scab) {
        System.out.println("attributeReplaced:MyContextListener");
    }
}
