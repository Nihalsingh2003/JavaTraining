package com.aurionpro.MiniECommerceCartSystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/addToCart")
public class AddToCartServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if (session == null || session.getAttribute("cart") == null) {
			resp.sendRedirect("Mini%20E-Commerce%20Cart%20System/Login.html");
			return;
		}
		
		if (session == null || session.getAttribute("username") == null) {

			resp.sendRedirect("Mini%20E-Commerce%20Cart%20System/Login.html");
			return;
		}
		

		session.setMaxInactiveInterval(30);

		ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");
		String[] products = req.getParameterValues("product");

		if (products != null) {
			cart.addAll(Arrays.asList(products));
		}
		renderCartPage(resp, cart);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null || session.getAttribute("cart") == null) {
			resp.sendRedirect("Mini%20E-Commerce%20Cart%20System/Login.html");
			return;
		}

		ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");
		renderCartPage(resp, cart);
	}

	private void renderCartPage(HttpServletResponse resp, ArrayList<String> cart) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>Your Cart</title>");
		out.println("<style>");
		out.println("body { font-family: Arial; padding: 40px; background: #f0f0f0; }");
		out.println(
				".container { max-width: 600px; margin: auto; background: white; padding: 30px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
		out.println("h1 { text-align: center; }");
		out.println(".cart-item { padding: 10px 0; border-bottom: 1px solid #ddd; }");
		out.println(
				"button { padding: 10px 20px; margin: 10px 5px; font-size: 16px; border: none; border-radius: 4px; cursor: pointer; }");
		out.println(".remove-btn { background-color: #dc3545; color: white; }");
		out.println(".continue-btn { background-color: #007bff; color: white; }");
		out.println(".logout-btn { background-color: #6c757d; color: white; }");
		out.println("</style>");
		out.println("</head><body>");

		out.println("<div class='container'>");
		out.println("<h1>Your Cart</h1>");

		if (cart.isEmpty()) {
			out.println("<p>Your cart is empty.</p>");
		} else {
			out.println("<form action='removeFromCart' method='POST'>");

			for (String item : cart) {
				out.println("<div class='cart-item'>");
				out.println(
						"<label><input type='checkbox' name='removeItem' value='" + item + "'> " + item + "</label>");
				out.println("</div>");
			}

			out.println("<button type='submit' class='remove-btn'>Remove Product</button>");
			out.println("</form>");
		}

		out.println("<div style='display: flex; justify-content: space-between; margin-top: 20px;'>");

		out.println("<form action='browseProduct' method='POST' style='margin: 0;'>");
		out.println("<button class='continue-btn'>Continue Shopping</button>");
		out.println("</form>");

		out.println("<form action='logout' method='POST' style='margin: 0;'>");
		out.println("<button class='logout-btn'>Logout</button>");
		out.println("</form>");

		out.println("</div>");

		out.println("</div></body></html>");
	}

}
