package com.aurionpro.servlet.model;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitFeedback")
public class FeedbackServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String productId = req.getParameter("productId");
		int rating = Integer.parseInt(req.getParameter("rating"));
		String review = req.getParameter("review");
		PrintWriter pw = resp.getWriter();

		if (rating >= 1 && rating <= 5) {
			if (review.trim().isBlank()) {
				pw.println("review can not be empty");
			} else {
				pw.println("Thank you for feedback");
				pw.println("productId: " + productId);
				pw.println("Rating: " + rating);
			}
		}else {
			pw.println("Rating should be between 1 to 5");
		}
	}
}
