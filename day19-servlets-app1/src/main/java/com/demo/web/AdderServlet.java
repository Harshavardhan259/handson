package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdderServlet  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String n1 = req.getParameter("num1");
		String n2 = req.getParameter("num2");
		
		if(n1== "" || n2 == "") {
			out.print("<h1>Fields can not be empty</h1>");
		}else {
			int sum = Integer.parseInt(n1)+Integer.parseInt(n2);
			out.print("<h1>the sum = "+sum+ "</h1>");
			out.print("<a href='adderPage.html'> Go to Adder page</a>");
		}
	}

}
