package login;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class loginServlet extends HttpServlet {

	 
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		HttpSession session = req.getSession();

		if (user.equals("admin") && pass.equals("root@123")) {

			session.setAttribute("username", user);// (key , values)
			resp.sendRedirect("home.jsp");

		} else {

			session.setAttribute("msg","Invalid username/password");
			resp.sendRedirect("index.jsp");
			}
       }
}




package login;
import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class logoutServlet  extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		 HttpSession session = req.getSession(); 
		  session.invalidate();
		  resp.sendRedirect("index.jsp");
	}
}