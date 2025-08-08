package com.aurionpro.BookInfoDisplaySystem;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/fiction", initParams = { @WebInitParam(name = "totalFictionVisitor", value = "0") })

public class FictionServlet extends HttpServlet {
	private int totalFictionVisitor;

	@Override
	public void init() throws ServletException {
		ServletConfig config = getServletConfig();
		totalFictionVisitor = Integer.parseInt(config.getInitParameter("totalFictionVisitor"));

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();

		HttpSession session = req.getSession(false);
		if (session == null || session.getAttribute("user") == null) {

			resp.sendRedirect(req.getContextPath() + "/welcome");
			return;
		}

		session.setMaxInactiveInterval(30);

		Integer totalVisits = (Integer) context.getAttribute("totalVisits");

		totalFictionVisitor++;
		session.setMaxInactiveInterval(30);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>BookVerse - Science Category Info</title>");
		out.println("<style>");
		out.println("body { font-family: Arial, sans-serif; background-color: #f4f7f9; margin: 40px; color: #333; }");
		out.println("h1 { color: #2c3e50; }");
		out.println("table { width: 50%; border-collapse: collapse; margin-top: 20px; }");
		out.println("td, th { border: 1px solid #ccc; padding: 12px 15px; text-align: left; }");
		out.println("th { background-color: #3498db; color: white; }");
		out.println("tr:nth-child(even) { background-color: #ecf0f1; }");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");

		out.println("<h1>BookVerse - Fiction Category Info</h1>");
		out.println("<table>");
		out.println("<tr><th>Property</th><th>Value</th></tr>");
		out.println("<tr><td>Book Category</td><td>Fiction</td></tr>");
		out.println("<tr><td>Store</td><td>BookVerse</td></tr>");
		out.println(
				"<tr><td>Admin Email</td><td><a href='mailto:admin@bookverse.com'>admin@bookverse.com</a></td></tr>");
		out.println("<tr><td>Fiction Books Visited</td><td>" + totalFictionVisitor + "</td></tr>");
		out.println("<tr><td>Total Visitors</td><td>" + totalVisits + "</td></tr>");
		out.println("<tr><td>App Version</td><td>1.2.3</td></tr>");
		out.println("</table>");

		out.println("<br><br>");
		out.println("<form action='" + req.getContextPath() + "/admin/fiction' method='get' style='display:inline;'>");
		out.println("<button type='submit'>Admin</button>");
		out.println("</form>");

		out.println("&nbsp;");

		out.println("<form action='" + req.getContextPath() + "/welcome' method='get' style='display:inline;'>");
		out.println("<button type='submit'>Go Back</button>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}
