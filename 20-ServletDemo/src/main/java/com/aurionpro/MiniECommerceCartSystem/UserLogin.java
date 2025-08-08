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

@WebServlet("/userLogin")
public class UserLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("user-username");
		String passWord = req.getParameter("user-password");

		if ("user".equals(userName.trim()) && "1234".equals(passWord.trim())) {
			HttpSession session = req.getSession(true);
			session.setAttribute("username", userName);
			System.out.println(session.getId());
			session.setAttribute("cart", new ArrayList<String>());
			RequestDispatcher rd = req.getRequestDispatcher("browseProduct");
			rd.forward(req, resp);
		} else {
			resp.sendRedirect("Mini%20E-Commerce%20Cart%20System/Login.html?error=1");
		}
	}
}
