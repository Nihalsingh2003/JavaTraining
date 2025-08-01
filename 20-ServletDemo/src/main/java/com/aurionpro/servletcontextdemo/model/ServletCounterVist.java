package com.aurionpro.servletcontextdemo.model;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/visit")
public class ServletCounterVist extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ServletContext context2=getServletContext();
	Integer count= (Integer) context2.getAttribute("counter");
	
	count++;
	
	context2.setAttribute("counter", count);
	
	PrintWriter pw=resp.getWriter();
	pw.println(count);
	
	
}
}
