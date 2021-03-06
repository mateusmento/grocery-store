package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "signin", urlPatterns = {"/api/signin"})
public class Signin extends HttpServlet
{

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // TODO: do credentials authentication and give a new session as a result of success
        
        String redirect_url = request.getParameter("redirect");
        redirect_url = redirect_url.equals("")? "/" : redirect_url;
        response.sendRedirect(redirect_url);
    }
}
