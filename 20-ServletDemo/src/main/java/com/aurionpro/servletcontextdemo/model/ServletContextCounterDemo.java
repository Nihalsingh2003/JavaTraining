package com.aurionpro.servletcontextdemo.model;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/counter")
public class ServletContextCounterDemo extends HttpServlet {

	@Override
	public void init() throws ServletException {
		ServletContext context=getServletContext();
		context.setAttribute("counter", 0);
		System.out.println("Counter is initialized");
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		resp.getWriter().println("Counter is initialized you can visit: ");
		pw.println("<a href=\"visit\">Visit</a>");

		
	}
}
