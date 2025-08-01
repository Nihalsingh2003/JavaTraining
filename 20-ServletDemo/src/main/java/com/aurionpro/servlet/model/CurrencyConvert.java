package com.aurionpro.servlet.model;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CurrencyConvert")
public class CurrencyConvert extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String amount = req.getParameter("amount");
		String from = req.getParameter("from");
		String to = req.getParameter("to");

		PrintWriter pw = resp.getWriter();
		if (amount.trim().isEmpty()) {
			pw.write("No amount entered");
		} else {
			double number = Double.parseDouble(amount);
			if (from.equalsIgnoreCase(to)) {
				pw.write("from and to can not be same");
			} else if (from.equalsIgnoreCase("usd")) {
				pw.write("INR: " + number * 89);
			} else {
				pw.write("USD: " + number / 89);
			}
		}

	}
}
