package com.aurionpro.MiniECommerceCartSystem;

import java.util.ArrayList;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();

        if (context.getAttribute("productList") == null) {
            ArrayList<ArrayList<String>> productList = new ArrayList<>();
            ArrayList<String> categoryNames = new ArrayList<>();

            ArrayList<String> electronics = new ArrayList<>();
            electronics.add("Laptop");
            electronics.add("Smartphone");
            productList.add(electronics);
            categoryNames.add("Electronics");

            ArrayList<String> accessories = new ArrayList<>();
            accessories.add("Headphones");
            accessories.add("Keyboard");
            accessories.add("Mouse");
            productList.add(accessories);
            categoryNames.add("Accessories");

            ArrayList<String> clothing = new ArrayList<>();
            clothing.add("T-shirt");
            clothing.add("Jeans");
            productList.add(clothing);
            categoryNames.add("Clothing");

            context.setAttribute("productList", productList);
            context.setAttribute("categoryNames", categoryNames);
        }
    }
}

