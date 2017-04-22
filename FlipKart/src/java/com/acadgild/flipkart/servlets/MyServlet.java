package com.acadgild.flipkart.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class MyServlet extends HttpServlet
{
        @Override
	public void init(ServletConfig cnf)throws ServletException
	{
		super.init(cnf);
	}
        
        @Override
	public void service(HttpServletRequest request, HttpServletResponse response)
							throws ServletException, IOException
	{
            	response.setContentType("text/html");
		PrintWriter out = response.getWriter();
                
		out.println("<html><head><title>Request List</title></head><body><center>");
		out.println("<h2>Hello User, Below are your request details..</h2>");
		out.println("<table border=1><th>Param Name</th><th>Param Value</th>");
                
		Enumeration enreq = request.getParameterNames();
		while(enreq.hasMoreElements())
		{
			String pname = enreq.nextElement().toString();
			String pvalue = request.getParameter(pname);
			out.println("<tr><td>"+pname+"</td><td>"+pvalue+"</td></tr>");			
		}
                out.println("<tr><td></td><td></td></tr>");
                out.println("<tr><td>Caller</td><td>"+request.getRemoteAddr()+"</td></tr>");
                out.println("<tr><td>Protocol</td><td>"+request.getProtocol()+"</td></tr>");
                out.println("<tr><td>Form Method</td><td>"+request.getMethod()+"</td></tr>");
                out.println("<tr><td>Content</td><td>"+request.getContentType()+"</td></tr>");
                out.println("<tr><td></td><td></td></tr>");
                Enumeration hnames = request.getHeaderNames();
                while(hnames.hasMoreElements())
		{
			String hname = hnames.nextElement().toString();
			String hvalue = request.getHeader(hname);
			out.println("<tr><td>"+hname+"</td><td>"+hvalue+"</td></tr>");			
		}
		out.println("</table></center></body></html>");
                
                out = null;
               // response.sendRedirect("SecondServlet?callername=Ram");
	}
	
}
