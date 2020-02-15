package net.codejava.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demoServlet")
public class DemoServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
	if (username.equals("user") && password.equals("user1")){
		PrintWriter writer = response.getWriter();

		String htmlRespone = "<html><h3>";
		htmlRespone += "Hello, " + username + "<br/>";
		htmlRespone += "</h3></html>";

		writer.println(htmlRespone);

	}
	else {
		response.sendError(HttpServletResponse.SC_NOT_FOUND);
	}

	}

}