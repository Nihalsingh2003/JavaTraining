package com.aurionpro.servlet.model;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/education")
public class Education extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	int age=Integer.parseInt(req.getParameter("age"));
	String course=req.getParameter("course");
	PrintWriter pw=resp.getWriter();
	
	if(name.trim().isBlank()&&email.trim().isBlank()) {
		pw.println("Name and email can not be empty");
	}else if(age<18) {
		pw.println("age should be greater or equal to 18");
	}else if(course.trim().isBlank()) {
		pw.println("Course must be selected.");
	}else {
		pw.println("Your data has been submited sucessfully");
		pw.println("Name: "+ name);
		pw.println("email: "+ email);
		pw.println("age: "+ age);
		pw.println("Course: "+ course);
	}
	
	
	
	
	
}
}
