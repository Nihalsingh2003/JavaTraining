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

@WebServlet("/showAllProducts")
public class AdminShowProduct extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		ArrayList<ArrayList<String>> productList = (ArrayList<ArrayList<String>>) context.getAttribute("productList");
		ArrayList<String> categoryNames = (ArrayList<String>) context.getAttribute("categoryNames");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'><head><meta charset='UTF-8'>");
		out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("<title>All Products</title>");
		out.println("<style>");
		out.println("body { font-family: 'Segoe UI', sans-serif; margin: 0; padding: 0; background-color: #f0f2f5; }");
		out.println("h1 { text-align: center; padding: 30px 0; color: #333; }");
		out.println(".container { max-width: 800px; margin: auto; background: #fff; padding: 30px; border-radius: 10px; box-shadow: 0 4px 10px rgba(0,0,0,0.1); }");
		out.println("select { width: 100%; padding: 12px 10px; margin-bottom: 20px; border-radius: 5px; border: 1px solid #ccc; font-size: 16px; }");
		out.println(".tab-content { display: none; }");
		out.println(".tab-content.active { display: block; }");
		out.println(".product { padding: 12px 15px; border-bottom: 1px solid #ddd; font-size: 16px; color: #444; }");
		out.println(".product:last-child { border-bottom: none; }");
		out.println("</style>");

		out.println("<script>");
		out.println("function showTab(index) {");
		out.println("  const contents = document.querySelectorAll('.tab-content');");
		out.println("  contents.forEach(tab => tab.classList.remove('active'));");
		out.println("  if (contents[index]) contents[index].classList.add('active');");
		out.println("}");
		out.println("window.onload = function() { showTab(0); };");
		out.println("</script>");

		out.println("</head><body>");
		out.println("<div class='container'>");
		out.println("<h1>Browse Products by Category</h1>");

		
		out.println("<label for='categorySelector'><strong>Select Category:</strong></label>");
		out.println("<select id='categorySelector' onchange='showTab(this.selectedIndex)'>");
		for (int i = 0; i < categoryNames.size(); i++) {
		    out.println("<option value='" + i + "'>" + categoryNames.get(i) + "</option>");
		}
		out.println("</select>");

		
		for (int i = 0; i < productList.size(); i++) {
		    ArrayList<String> categoryProducts = productList.get(i);
		    out.println("<div class='tab-content'>");
		    if (categoryProducts.isEmpty()) {
		        out.println("<p>No products available in this category.</p>");
		    } else {
		        for (String product : categoryProducts) {
		            out.println("<div class='product'>" + product + "</div>");
		        }
		    }
		    out.println("</div>");
		}
		out.println("<div style='text-align:center; margin-top: 20px;'>");
		out.println("<a href='adminHome' style='text-decoration:none;'>");
		out.println("<button style='background-color:#007bff; color:white; border:none; padding: 10px 20px; border-radius: 5px; cursor:pointer; font-size:16px;'>Go Back to Dashboard</button>");
		out.println("</a>");
		out.println("</div>");

		out.println("</div>"); 
		out.println("</body></html>");
	}

}
