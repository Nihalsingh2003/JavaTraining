package com.aurionpro.demoservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/AgeVerification")
public class AgeVerification extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int age=Integer.parseInt(req.getParameter("age"));
	
	if(age<18) {
		resp.setContentType("text/html");
		PrintWriter ps=resp.getWriter();
		ps.println("You are under age");
		RequestDispatcher rd=req.getRequestDispatcher("AgeVerification.html");
		rd.include(req, resp);
	}else if(age>=18 && age<=60) {
		RequestDispatcher rd=req.getRequestDispatcher("under60");
		rd.forward(req, resp);
		
	}else if(age>60) {
		RequestDispatcher rd=req.getRequestDispatcher("over60");
		rd.forward(req, resp);
		
	}
}
}
