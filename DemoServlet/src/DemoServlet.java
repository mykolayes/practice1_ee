package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demoServlet")
public class DemoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	                     throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<div align=\"center\">");
		out.println("<form method=\"post\" action=\"demoServlet\">");
		out.println("Username: <input type=\"text\" name=\"username\"/> <br/>");
		out.println("Password: <input type=\"password\" name=\"password\"/> <br/><br/>");
		out.println("<br/><br/>");
		out.println("<input type=\"submit\" value=\"Submit\" />");
		out.println("</form>");
		out.println("</div");
		out.println("</body></html>");
		// RequestDispatcher view = request.getRequestDispatcher("C:/Dev/TomcatDir/webapps/DemoServlet/FormDemo.html");
		// view.forward(request, response);
	}
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