package com.javaGG.ex;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ContextListnerEx
 *
 */
@WebListener
public class ContextListnerEx implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ContextListnerEx() {
        // TODO Auto-generated constructor stub
    }
       
    /**
     * @see ServletContextEvent#ServletContextEvent(ServletContext)
     */
    public ContextListnerEx(ServletContext source) {
        // super(source);
        // TODO Auto-generated constructor stub
    }

   /**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
       System.out.println("contextDestroyed !!");
    }
   /**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
       System.out.println("contextInitialized !!");
    }
}