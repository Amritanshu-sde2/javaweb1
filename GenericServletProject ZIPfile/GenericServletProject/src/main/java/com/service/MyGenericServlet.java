package com.service;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyGenericServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		res.setContentType("text/html");
		PrintWriter p = res.getWriter();
		p.print("<html><body>");
		p.print("<h1>Servlet is created...</h1>");
		p.print("<a href=\"index.html\">Go back</a>");
		p.print("</body></html>");
	}

}
