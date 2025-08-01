package com.aurionpro.servlet.model;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/transfer")
public class FundTransferServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sourceAccount = req.getParameter("sourceAccount");
		int amount = Integer.parseInt(req.getParameter("amount"));
		String destinationAccount = req.getParameter("destinationAccount");
		PrintWriter pw = resp.getWriter();

		if (sourceAccount.equals(destinationAccount)) {
			pw.println("Transaction failed");
			pw.println("Both accounts can not be same");

		} else if (amount <0 && amount > 50000) {
			pw.println("Transaction failed");
			pw.println("Amount must be  positive and less then or equal to 50,000.");

		} else {
			pw.println("Transaction completed");
			pw.println(amount + " is sent from " + sourceAccount + " to " + destinationAccount);
		}
	}
}
