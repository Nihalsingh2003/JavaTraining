package com.aurionpro.BookInfoDisplaySystem;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdminServlet extends HttpServlet {

	private String storeName;
	private String adminEmail;
	private String bookCategory;

	@Override
	 public void init(ServletConfig config) throws ServletException {
        super.init(config); 

        storeName = config.getInitParameter("storeName");
        adminEmail = config.getInitParameter("adminEmail");
        bookCategory = config.getInitParameter("category");
    }


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    out.println("<!DOCTYPE html>");
	    out.println("<html lang='en'>");
	    out.println("<head>");
	    out.println("<meta charset='UTF-8'>");
	    out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
	    out.println("<title>Admin Panel - BookVerse</title>");
	    out.println("<style>");
	    out.println("body { font-family: 'Segoe UI', sans-serif; background-color: #f0f2f5; padding: 40px; }");
	    out.println(".admin-panel { max-width: 600px; margin: auto; background-color: #fff; padding: 30px; border-radius: 10px; box-shadow: 0 0 12px rgba(0,0,0,0.1); }");
	    out.println("h1 { color: #2c3e50; margin-bottom: 20px; }");
	    out.println("p { font-size: 1.1em; margin: 12px 0; }");
	    out.println("span.label { font-weight: bold; color: #34495e; }");
	    out.println("</style>");
	    out.println("</head>");
	    out.println("<body>");

	    out.println("<div class='admin-panel'>");
	    out.println("<h1>Admin Panel</h1>");
	    out.println("<p><span class='label'>Store Name:</span> " + storeName + "</p>");
	    out.println("<p><span class='label'>Admin Email:</span> <a href='mailto:" + adminEmail + "'>" + adminEmail + "</a></p>");
	    out.println("<p><span class='label'>Book Category:</span> " + bookCategory + "</p>");
	    out.println("<br><a href='" + request.getContextPath() + "/welcome' style='display:inline-block; margin-top:20px; padding:10px 20px; background-color:#3498db; color:white; text-decoration:none; border-radius:5px;'>⬅ Back to Home</a>");
	    out.println("</div>");

	    out.println("</body>");
	    out.println("</html>");
	}

}
