package com.aurionpro.servlet.model;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitApplication")
public class ResumeUploadServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String resume = request.getParameter("resume");
		String skills = request.getParameter("skills");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		
		if (name == null || name.length() < 2) {
			out.println("Invalid name. Must be at least 2 characters.<br>");
			return;
		}

		if (email == null || !email.contains("@")) {
			out.println("Invalid email.<br>");
			return;
		}

		if (skills == null || skills.trim().isEmpty()) {
			out.println("Please enter at least one skill.<br>");
			return;
		}

		out.println("<h2>Resume Preview</h2>");
		out.println("Name: " + name + "<br>");
		out.println("Email: " + email + "<br>");
		out.println("Skills:<ul>");
		for (String skill : skills.split(",")) {
			out.println("<li>" + skill.trim() + "</li>");
		}
		out.println("</ul>");
		out.println("<pre>" + resume + "</pre>");
	}
}
