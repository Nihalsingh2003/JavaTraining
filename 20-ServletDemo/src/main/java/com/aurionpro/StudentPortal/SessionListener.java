package com.aurionpro.StudentPortal;

import java.util.Set;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext ctx = se.getSession().getServletContext();

        Integer count = (Integer) ctx.getAttribute("activeUsers");
        if (count == null) {
            count = 0;
        }
        ctx.setAttribute("activeUsers", count + 1);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext ctx = se.getSession().getServletContext();
        Set<String> users = (Set<String>) ctx.getAttribute("userSet");
        String username = (String) se.getSession().getAttribute("studentName");

        if (username != null && users != null) {
            users.remove(username);
            ctx.setAttribute("userSet", users);
        }

        Integer count = (Integer) ctx.getAttribute("activeUsers");
        if (count != null && count > 0) {
            ctx.setAttribute("activeUsers", count - 1);
        }
    }
}
