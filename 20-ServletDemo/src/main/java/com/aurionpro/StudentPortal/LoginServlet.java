package com.aurionpro.StudentPortal;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Set;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/studentlogin")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String studentName = request.getParameter("studentName");

        if (studentName != null && !studentName.trim().isEmpty()) {
            HttpSession session = request.getSession();
            session.setAttribute("studentName", studentName);

            System.out.println(session.getId());

            
            String lastVisitTime = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("lastVisit")) {
                        lastVisitTime = URLDecoder.decode(cookie.getValue(), "UTF-8");
                        break;
                    }
                }
            }

            
            request.setAttribute("lastVisitTime", lastVisitTime);

          
            String encodedDate = URLEncoder.encode(new Date().toString(), "UTF-8");
            Cookie lastVisit = new Cookie("lastVisit", encodedDate);
            lastVisit.setMaxAge(60 * 60 * 24); // 1 day
            response.addCookie(lastVisit);

            ServletContext ctx = getServletContext();
            Set<String> users = (Set<String>) ctx.getAttribute("userSet");
            if (users == null) {
                users = new java.util.HashSet<>();
            }
            users.add(studentName);
            ctx.setAttribute("userSet", users);

            RequestDispatcher rd = request.getRequestDispatcher("dashboard");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("error.html");
            rd.forward(request, response);
        }
    }
}
