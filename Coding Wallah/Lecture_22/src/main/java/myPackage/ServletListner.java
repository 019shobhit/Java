package myPackage;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionActivationListener;
import jakarta.servlet.http.HttpSessionEvent;

/**
 * Application Lifecycle Listener implementation class ServletListner
 *
 */
@WebListener
public class ServletListner implements HttpSessionActivationListener {

    /**
     * Default constructor. 
     */
    public ServletListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
     */
    public void sessionDidActivate(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
     */
    public void sessionWillPassivate(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }
	
}
