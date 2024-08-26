package com.demo.web.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/checkout2")
public class Checkout2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(true);

		Enumeration<String> itemNames = session.getAttributeNames();
		out.print("<h2>Your Cart Details</h2>");
		out.print("<hr></hr>");
		while (itemNames.hasMoreElements()) {
			String name = itemNames.nextElement();
			String price = (String) session.getAttribute(name);
			out.write("<h1>"+ name+ " "+price+"</h1>");
		}
		out.print("<h2>Thank You for Shopping with us");

	}

}
