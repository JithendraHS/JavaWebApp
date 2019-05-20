package com.JavaWebApplication.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.JavaWebApplication.Beans.RegisterBean;
import com.JavaWebApplication.Model.UserDB;

/**
 * Servlet implementation class Contact
 */
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
         PrintWriter out = response.getWriter();
	    
		String data=null;
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		RegisterBean user1 = new RegisterBean();
		user1.setEmail(email);
		user1.setPassword(password);
			UserDB dp = new UserDB();
			String s1 = dp.readData1(user1);
		if(s1.equalsIgnoreCase("allow")) {
			HttpSession session = request.getSession();
			session.setAttribute("email",email);
			//if(notify==null) {
				request.getRequestDispatcher(WEB.NEWPAGE).forward(request, response);
			}
			
		
		else {
			//out.println("Wrong username or password");
			HttpSession session = request.getSession();
			session.setAttribute("email",email);
			request.getRequestDispatcher(WEB.WELCOME).forward(request, response);
		}
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
