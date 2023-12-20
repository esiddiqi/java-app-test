package com.emaad.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // You can implement your authentication logic here.
        // For simplicity, let's check if the username and password are not empty.
        if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
            // Authentication successful
            response.sendRedirect("welcome.jsp");
        } else {
            // Authentication failed
            response.sendRedirect("login.jsp?error=true");
        }
    }
}