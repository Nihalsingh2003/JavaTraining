package com.aurionpro.MiniECommerceCartSystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/removeFromCart")
public class RemoveFromCart extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] product = req.getParameterValues("removeItem");

        HttpSession session = req.getSession(false);
        if (session == null || session.getAttribute("cart") == null) {
            resp.sendRedirect("Mini%20E-Commerce%20Cart%20System/Login.html");
            return;
        }
		ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");
		if (product != null) {
			cart.removeAll(Arrays.asList(product));
			resp.sendRedirect("addToCart");
		}else {
			resp.sendRedirect("addToCart");
		}
	}
}
