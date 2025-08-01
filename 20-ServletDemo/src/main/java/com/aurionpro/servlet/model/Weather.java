package com.aurionpro.servlet.model;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/weather")
public class Weather extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cityName = req.getParameter("city");
		PrintWriter pw = resp.getWriter();
		if (cityName.trim().isEmpty()) {
			pw.write("No city entered");
		} else {
			if (cityName.equalsIgnoreCase("Delhi")) {
				pw.println("temperature" + " 29 C");
				pw.println("humidity" + " 85 F");
			} else if (cityName.equalsIgnoreCase("Mumbai")) {
				pw.println("temperature " + " 21 C");
				pw.println("humidity" + " 80 F");
			}
		}
	}
}
