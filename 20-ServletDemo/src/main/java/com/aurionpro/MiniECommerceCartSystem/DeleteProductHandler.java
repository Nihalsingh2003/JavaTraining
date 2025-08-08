package com.aurionpro.MiniECommerceCartSystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteProductHandler")
public class DeleteProductHandler extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		ArrayList<ArrayList<String>> productList = (ArrayList<ArrayList<String>>) context.getAttribute("productList");
		ArrayList<String> categoryNames = (ArrayList<String>) context.getAttribute("categoryNames");
		String selectedCategoryName = req.getParameter("selectedCategoryName");
		String[] selectedProducts = req.getParameterValues("productsToDelete");

		if (selectedCategoryName != null && selectedProducts != null) {
			int categoryIndex = categoryNames.indexOf(selectedCategoryName);

			if (categoryIndex != -1) {
				ArrayList<String> productsInCategory = productList.get(categoryIndex);

				for (String product : selectedProducts) {
					productsInCategory.remove(product);
				}

				if (productsInCategory.isEmpty()) {
					categoryNames.remove(selectedCategoryName);
					productList.remove(categoryIndex);
				}
			}
		}

		context.setAttribute("productList", productList);
		context.setAttribute("categoryNames", categoryNames);

		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'><head><meta charset='UTF-8'>");
		out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("<title>Deletion Success</title>");
		out.println("<style>");
		out.println(
				"body { font-family: 'Segoe UI', sans-serif; background-color: #f0f2f5; text-align: center; padding: 50px; }");
		out.println(
				".message-box { background: white; padding: 30px; border-radius: 8px; box-shadow: 0 2px 8px rgba(0,0,0,0.1); display: inline-block; }");
		out.println(
				"button { background-color: #007bff; color: white; border: none; padding: 10px 20px; border-radius: 5px; cursor: pointer; font-size: 16px; margin-top: 20px; }");
		out.println("button:hover { background-color: #0056b3; }");
		out.println("</style>");
		out.println("</head><body>");

		out.println("<div class='message-box'>");
		out.println("<h2>Product(s) deleted successfully!</h2>");
		out.println("<form action='adminHome' method='get'>");
		out.println("<button type='submit'>Go Back to Dashboard</button>");
		out.println("</form>");
		out.println("</div>");

		out.println("</body></html>");
	}

}
