package com.aurionpro.servlet.model;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class ServletWithoutXml extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("userName");
		PrintWriter pw = resp.getWriter();
		
		if (name.trim().isEmpty()) {
			pw.write("null");
		} else {
			pw.write("welcome to servlet page:"+name);
		}

	}
}
