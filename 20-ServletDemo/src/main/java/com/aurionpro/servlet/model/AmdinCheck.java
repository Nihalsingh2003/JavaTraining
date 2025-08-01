package com.aurionpro.servlet.model;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/admin")
public class AmdinCheck extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("userName");
		String password = req.getParameter("password");

		PrintWriter pw = resp.getWriter();

		if (name.equalsIgnoreCase("admin") && password.equals("1234")) {
			pw.write("welcome admin");
		} else {
			pw.write("Access denied");
		}

	}
}
