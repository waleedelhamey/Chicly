package com.chickly.PresentationLayer.Validators;

import com.chickly.BussinesLayer.CustomerService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "usernameValidator", urlPatterns = "/usernameValidator")
public class UsernameValidator extends HttpServlet {
    private CustomerService customerService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        String uName = req.getParameter("uName");
        customerService = new CustomerService();
        if (uName == null) {
            out.print("Username is required");
            return;
        }

        if (customerService.usernameValidation(uName)) {
            out.print("This username already exists");
        }
    }
}