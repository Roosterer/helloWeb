package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Created by gaokuo on 2018/2/8.
 */
public class MyRequestListener implements ServletRequestListener{

    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("requestDestroyed:MyRequestListener");
    }

    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("requestInitialized:MyRequestListener");
    }
}
