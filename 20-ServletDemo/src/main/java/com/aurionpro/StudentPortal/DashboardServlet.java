package com.aurionpro.StudentPortal;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.Set;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(
	    urlPatterns = "/dashboard",
	    initParams = {
	        @WebInitParam(name = "instructor", value = "Prof. Sharma")
	    }
	)
public class DashboardServlet extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("studentName") == null) {
            response.sendRedirect("studentLogin.html");
            return;
        }

        String studentName = (String) session.getAttribute("studentName");

        Cookie[] cookies = request.getCookies();
        String lastVisit = null;
        if (cookies != null) {
            for (Cookie c : cookies) {
                if ("lastVisit".equals(c.getName())) {
                    lastVisit = URLDecoder.decode(c.getValue(), "UTF-8");
                }
            }
        }

        ServletContext context = getServletContext();
        String msg = (String) context.getAttribute("message");
        Integer activeUsers = (Integer) context.getAttribute("activeUsers");
        Set<String> users = (Set<String>) context.getAttribute("userSet");

        ServletConfig config = getServletConfig();
        String instructor = config.getInitParameter("instructor");

        // Start HTML response
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("    <meta charset='UTF-8'>");
        out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("    <title>Student Dashboard</title>");
        out.println("    <link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css'>");
        out.println("    <style>");
        out.println("        body { background-color: #f4f6f8; }");
        out.println("        .dashboard { max-width: 800px; margin: 50px auto; padding: 30px; background: white; box-shadow: 0 0 10px rgba(0,0,0,0.1); border-radius: 10px; }");
        out.println("        h1 { color: #343a40; }");
        out.println("        .info { margin-bottom: 15px; }");
        out.println("    </style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='dashboard'>");
        out.println("    <h1 class='mb-4'>Welcome, " + studentName + "</h1>");

        if (lastVisit != null) {
            out.println("    <div class='alert alert-info'>Last visit: " + lastVisit + "</div>");
        }

        out.println("    <div class='info'><strong>Message from Admin:</strong> " + msg + "</div>");
        out.println("    <div class='info'><strong>Instructor:</strong> " + instructor + "</div>");
        out.println("    <div class='info'><strong>Active Sessions:</strong> " + activeUsers + "</div>");
        out.println("    <div class='info'><strong>Unique Users Online:</strong> " + users.size() + "</div>");

        out.println("    <a href='studentlogout' class='btn btn-danger mt-4'>Logout</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

}