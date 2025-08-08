package com.aurionpro.MiniECommerceCartSystem;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/adminLogin")
public class AdminLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String adminName = req.getParameter("admin-username");
		String passWord = req.getParameter("admin-password");

		if ("admin".equals(adminName.trim()) && "1234".equals(passWord.trim())) {
			HttpSession session = req.getSession(true);
			session.setAttribute("username", adminName);
			session.setAttribute("cart", new ArrayList<String>());
			RequestDispatcher rd = req.getRequestDispatcher("adminHome");
			rd.forward(req, resp);
		} else {
			resp.sendRedirect("Mini%20E-Commerce%20Cart%20System/Login.html?error=1");
		}
	}
}
