package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "signup", urlPatterns = {"/api/signup"})
public class Signup extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException    
    {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");

        // TODO: save user information in database
        
        String redirect_url = request.getParameter("redirect");
        redirect_url = redirect_url.equals("")? "/" : redirect_url;
        response.sendRedirect(redirect_url);
    }
}
