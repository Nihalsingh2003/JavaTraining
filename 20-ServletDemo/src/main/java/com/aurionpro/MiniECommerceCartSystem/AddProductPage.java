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
@WebServlet("/addProduct")
public class AddProductPage extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    ServletContext context = getServletContext();

	    String productName = req.getParameter("productName");
	    String existingCategory = req.getParameter("existingCategory");
	    String newCategory = req.getParameter("newCategory");

	    existingCategory = existingCategory != null ? existingCategory.trim() : "";
	    newCategory = newCategory != null ? newCategory.trim() : "";

	    // Validate category selection
	    if (existingCategory.isBlank() && newCategory.isBlank()) {
	        resp.setContentType("text/html");
	        PrintWriter out = resp.getWriter();

	        out.println("<html><body>");
	        out.println("<h3 style='color:red;'>Please select an existing category or enter a new one.</h3>");
	        out.println("<a href='addProductPage'>Go Back</a>");
	        out.println("</body></html>");
	        return;
	    }

	    String chosenCategory = !existingCategory.isBlank() ? existingCategory : newCategory;

	    ArrayList<String> categoryNames = (ArrayList<String>) context.getAttribute("categoryNames");
	    ArrayList<ArrayList<String>> productList = (ArrayList<ArrayList<String>>) context.getAttribute("productList");

	    if (categoryNames == null || productList == null) {
	        categoryNames = new ArrayList<>();
	        productList = new ArrayList<>();
	        context.setAttribute("categoryNames", categoryNames);
	        context.setAttribute("productList", productList);
	    }

	    int index;
	    if (!categoryNames.contains(chosenCategory)) {
	        
	        categoryNames.add(chosenCategory);
	        ArrayList<String> newProductGroup = new ArrayList<>();
	        newProductGroup.add(productName);
	        productList.add(newProductGroup);
	    } else {
	       
	        index = categoryNames.indexOf(chosenCategory);
	        ArrayList<String> productsInCategory = productList.get(index);

	        if (productsInCategory.contains(productName)) {
	          
	            resp.setContentType("text/html");
	            PrintWriter out = resp.getWriter();

	            out.println("<html><body>");
	            out.println("<h3 style='color:red;'>Product \"" + productName + "\" already exists in category \"" + chosenCategory + "\".</h3>");
	            out.println("<a href='addProductPage'>Go Back</a>");
	            out.println("</body></html>");
	            return;
	        } else {
	            
	            productsInCategory.add(productName);
	        }
	    }

	   
	    resp.sendRedirect("showAllProducts");
	}


}
