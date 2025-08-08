package com.aurionpro.StudentPortal;

import java.util.HashSet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext ctx = sce.getServletContext();
        ctx.setAttribute("message", "Welcome to the Student Portal!");
        ctx.setAttribute("activeUsers", 0);
        ctx.setAttribute("userSet", new HashSet<String>());
    }

    public void contextDestroyed(ServletContextEvent sce) {}
}
