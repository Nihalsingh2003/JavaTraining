package com.aurionpro.MiniECommerceCartSystem;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/adminHome")
public class AdminHomePage extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>Admin Dashboard</title>");
		out.println("<style>");
		out.println("body { font-family: Arial; background: #f5f5f5; padding: 40px; }");
		out.println(
				".container { max-width: 500px; margin: auto; background: white; padding: 30px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); text-align: center; }");
		out.println("h1 { margin-bottom: 30px; }");
		out.println("form { margin: 20px 0; }");
		out.println(
				"button { padding: 12px 25px; margin: 10px 0; font-size: 16px; border: none; border-radius: 4px; cursor: pointer; width: 80%; }");
		out.println(".show-btn { background-color: #007bff; color: white; }");
		out.println(".add-btn { background-color: #28a745; color: white; }");
		out.println(".delete-btn { background-color: #dc3545; color: white; }");
		out.println(".logout-btn { background-color: #6c757d; color: white; width: 50%; }");
		out.println("</style>");
		out.println("</head><body>");
		out.println("<div class='container'>");
		out.println("<h1>Admin Dashboard</h1>");

		out.println("<form action='showAllProducts' method='GET'>");
		out.println("<button type='submit' class='show-btn'>Show All Products</button>");
		out.println("</form>");

		out.println("<form action='addProductPage' method='GET'>");
		out.println("<button type='submit' class='add-btn'>Add Product</button>");
		out.println("</form>");

		out.println("<form action='deleteProductPage' method='GET'>");
		out.println("<button type='submit' class='delete-btn'>Delete Product</button>");
		out.println("</form>");

		out.println("<form action='logout' method='POST'>");
		out.println("<button type='submit' class='logout-btn'>Logout</button>");
		out.println("</form>");

		out.println("</div></body></html>");
	}
}
