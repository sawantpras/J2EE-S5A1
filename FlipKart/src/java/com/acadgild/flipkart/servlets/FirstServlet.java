package com.acadgild.flipkart.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
        
public class FirstServlet extends HttpServlet
{
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {
        // receive request from html client
        String cname = request.getParameter("username"); //in this case, parameter username's value = Ram
 
        //process it
        
        //Give response back to html client
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<h1 style='color:green'>Hello " + cname + "</h1>");
    }
}
