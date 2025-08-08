package com.aurionpro.MiniECommerceCartSystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/browseProduct")
public class UserHomePage extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		if (session == null || session.getAttribute("username") == null) {

			resp.sendRedirect("Mini%20E-Commerce%20Cart%20System/Login.html");
			return;
		}
		

		session.setMaxInactiveInterval(60);
		ServletContext context = getServletContext();
		ArrayList<ArrayList<String>> productList = (ArrayList<ArrayList<String>>) context.getAttribute("productList");
		ArrayList<String> categoryNames = (ArrayList<String>) context.getAttribute("categoryNames");

		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>Browse Products</title>");
		out.println("<style>");
		out.println("body { font-family: Arial; padding: 40px; background: #f0f0f0; }");
		out.println("h1 { text-align: center; }");
		out.println("div.container { max-width: 800px; margin: auto; background: white; padding: 30px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
		out.println(".tabs { display: flex; margin-bottom: 20px; }");
		out.println(".tab-button { flex: 1; padding: 10px; cursor: pointer; background: #eee; border: none; font-weight: bold; }");
		out.println(".tab-button.active { background: #007bff; color: white; }");
		out.println(".tab-content { display: none; }");
		out.println(".tab-content.active { display: block; }");
		out.println(".product { padding: 10px 0; border-bottom: 1px solid #ddd; }");
		out.println("button[type='submit'] { background-color: #28a745; color: white; padding: 12px 20px; font-size: 16px; border: none; border-radius: 4px; cursor: pointer; }");
		out.println("button[type='submit']:hover { background-color: #218838; }");
		out.println(".logout-button { background-color:#dc3545; color:white; border:none; padding:8px 15px; border-radius:5px; cursor:pointer; }");
		out.println(".logout-button:hover { background-color: #c82333; }");
		out.println(".logout-container { text-align: center; margin-top: 30px; }");
		out.println(".logout-button { background-color:#ff0000; color:white; border:none; padding:8px 15px; border-radius:5px; cursor:pointer; }");
		out.println(".logout-button:hover { background-color: #cc0000; }");
		out.println("</style>");
		out.println("<script>");
		out.println("function showTab(index) {");
		out.println("  var tabs = document.querySelectorAll('.tab-content');");
		out.println("  var buttons = document.querySelectorAll('.tab-button');");
		out.println("  tabs.forEach(tab => tab.classList.remove('active'));");
		out.println("  buttons.forEach(btn => btn.classList.remove('active'));");
		out.println("  tabs[index].classList.add('active');");
		out.println("  buttons[index].classList.add('active');");
		out.println("}");
		out.println("window.onload = function() { showTab(0); };");
		out.println("</script>");
		out.println("</head><body>");

		out.println("<h1>Browse Products by Category</h1>");
		out.println("<div class='container'>");

		out.println("<form action='addToCart' method='POST'>");

		out.println("<div class='tabs'>");
		for (int i = 0; i < categoryNames.size(); i++) {
			out.println("<button type='button' class='tab-button' onclick='showTab(" + i + ")'>" + categoryNames.get(i) + "</button>");
		}
		out.println("</div>");

		for (int i = 0; i < productList.size(); i++) {
			ArrayList<String> categoryProducts = productList.get(i);
			out.println("<div class='tab-content'>");
			for (String product : categoryProducts) {
				out.println("<div class='product'>");
				out.println("<label><input type='checkbox' name='product' value='" + product + "'> " + product + "</label>");
				out.println("</div>");
			}
			out.println("</div>");
		}

		out.println("<div style='text-align:center; margin-top:20px;'>");
		out.println("<button type='submit'>Add to Cart</button>");
		out.println("</div>");
		out.println("</form>");

		out.println("<div class='logout-container'>");
		out.println("<form action='logout' method='POST'>");
		out.println("<button type='submit' class='logout-button'>Logout</button>");
		out.println("</form>");
		out.println("</div>");

		out.println("</div>");

		out.println("</body></html>");
	}
}
