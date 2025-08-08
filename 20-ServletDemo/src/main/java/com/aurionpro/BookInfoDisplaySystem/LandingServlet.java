package com.aurionpro.BookInfoDisplaySystem;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/welcome")
public class LandingServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {

		ServletContext context = getServletContext();
		if (context.getAttribute("totalVisits") == null) {
			context.setAttribute("totalVisits", 0);
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext context = getServletContext();
		HttpSession session = request.getSession(true);  
		session.setMaxInactiveInterval(30); 
		session.setAttribute("user", "guest"); 


		Integer totalVisits = (Integer) context.getAttribute("totalVisits");
		totalVisits++;
		context.setAttribute("totalVisits", totalVisits);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("<title>Welcome to BookVerse</title>");
		out.println("<style>");
		out.println(
				"body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f4f7f9; color: #333; margin: 0; padding: 20px; }");
		out.println(
				".container { max-width: 700px; margin: auto; background: white; padding: 30px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
		out.println("h1 { color: #2c3e50; }");
		out.println("p { font-size: 1.1em; }");
		out.println("ul { list-style: none; padding: 0; display: flex; gap: 15px; flex-wrap: wrap; }");

		out.println(
				"a { text-decoration: none; color: white; background-color: #3498db; padding: 10px 15px; border-radius: 5px; transition: background 0.3s; }");
		out.println("a:hover { background-color: #2980b9; }");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class='container'>");
		out.println("<h1>Welcome to <span style='color:#3498db;'>BookVerse</span>!</h1>");
		out.println("<p>Total Visitors So Far: <strong>" + totalVisits + "</strong></p>");
		out.println("<h3>Select a Category:</h3>");
		out.println("<ul>");
		out.println("<li><a href='" + request.getContextPath() + "/fiction'>Fiction</a></li>");
		out.println("<li><a href='" + request.getContextPath() + "/science'>Science</a></li>");
		out.println("<li><a href='" + request.getContextPath() + "/technology'>Technology</a></li>");
		out.println("</ul>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}

}
