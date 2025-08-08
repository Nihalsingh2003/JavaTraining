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

@WebServlet("/addProductPage")
public class AdminAddProductServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		ArrayList<String> categoryNames = (ArrayList<String>) context.getAttribute("categoryNames");
		resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();

	    out.println("<!DOCTYPE html>");
	    out.println("<html lang='en'><head><meta charset='UTF-8'>");
	    out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
	    out.println("<title>Add Product & Category</title>");
	    out.println("<style>");
	    out.println("body { font-family: 'Segoe UI', sans-serif; background-color: #f4f4f4; padding: 40px; }");
	    out.println(".container { max-width: 600px; margin: auto; background: white; padding: 30px; border-radius: 8px; box-shadow: 0 0 15px rgba(0,0,0,0.1); }");
	    out.println("h2 { text-align: center; margin-bottom: 30px; color: #333; }");
	    out.println("label { display: block; margin-top: 15px; font-weight: bold; }");
	    out.println("input[type='text'], select { width: 100%; padding: 10px; margin-top: 5px; border: 1px solid #ccc; border-radius: 5px; font-size: 16px; }");
	    out.println("input[type='submit'] { margin-top: 25px; background-color: #007bff; color: white; border: none; padding: 12px; width: 100%; font-size: 16px; border-radius: 5px; cursor: pointer; }");
	    out.println("input[type='submit']:hover { background-color: #0056b3; }");
	    out.println("</style>");
	    out.println("</head><body>");
	    
	    out.println("<div class='container'>");
	    out.println("<h2>Add New Product</h2>");
	    out.println("<form method='POST' action='addProduct'>"); 

	    // Product Name
	    out.println("<label for='productName'>Product Name:</label>");
	    out.println("<input type='text' id='productName' name='productName' required>");

	    
	    out.println("<label for='existingCategory'>Choose Existing Category:</label>");
	    out.println("<select id='existingCategory' name='existingCategory'>");
	    out.println("<option value=''>-- Select a Category --</option>");

	    if (categoryNames != null) {
	        for (String category : categoryNames) {
	            out.println("<option value='" + category + "'>" + category + "</option>");
	        }
	    }
	    out.println("</select>");

	    //  Add New Category
	    out.println("<label for='newCategory'>Or Add New Category:</label>");
	    out.println("<input type='text' id='newCategory' name='newCategory' placeholder='Enter new category name'>");

	  
	    out.println("<input type='submit' value='Add Product'>");

	    out.println("</form>");
	    out.println("<div style='text-align:center; margin-top: 20px;'>");
	    out.println("<a href='adminHome' style='display:inline-block; background-color:#007bff; color:white; text-align:center; text-decoration:none; padding:10px 20px; border-radius:5px; font-size:16px;'>Go Back to Dashboard</a>");
	    out.println("</div>");


	    out.println("</div>");

	    out.println("</body></html>");
	}

}
