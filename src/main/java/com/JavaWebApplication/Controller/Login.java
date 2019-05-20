package com.JavaWebApplication.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.JavaWebApplication.Beans.RegisterBean;
import com.JavaWebApplication.Model.UserDB;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		String notify ="null";
		RegisterBean user = new RegisterBean();
		user.setEmail(email);
		user.setPassword(password);
		user.setNotification(notify);
		//UserDB dp = new UserDB();
		//String s1 = dp.readData(user);
			UserDB dp = new UserDB();
			String s1 = dp.readData(user);
		if(s1.equalsIgnoreCase("nonotify")) {
			HttpSession session = request.getSession();
			session.setAttribute("email",email);
			//if(notify==null) {
				request.getRequestDispatcher(WEB.NONOTIFICATION).forward(request, response);
			}
		if(s1.equalsIgnoreCase("notify")) {
			//HttpSession session = request.getSession();
			//session.setAttribute("email",email);
			//if(notify==null) {
			UserDB dp1 = new UserDB();
			String s2 = dp1.readInfo();
			//if(s2.equalsIgnoreCase("ok")) {
			if(s2 != null) {
			System.out.println(s2);
				HttpSession session = request.getSession();
				session.setAttribute("data",s2);
				//System.out.println("10");
				//System.out.println(s3);
				request.getRequestDispatcher(WEB.NOTIFICATION).forward(request, response);
			//}
			}
			
		
		else {
			//out.println("Wrong username or password");
			HttpSession session = request.getSession();
			session.setAttribute("email",email);
			request.getRequestDispatcher(WEB.WELCOME).forward(request, response);
		}
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
