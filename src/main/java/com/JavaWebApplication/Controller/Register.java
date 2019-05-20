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
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		String name = request.getParameter("name");
		String fathername =request.getParameter("fathername");
		String branch= request.getParameter("branch");
		String semester=request.getParameter("semester");
		String cgpa= request.getParameter("cgpa");
		String mobilenumber = request.getParameter("mobilenumber");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String usn = request.getParameter("usn");
		String srno = request.getParameter("srno");
		String notification=null;
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(fathername);
		System.out.println(branch);
		System.out.println(semester);
		System.out.println(cgpa);
		System.out.println(mobilenumber);
		System.out.println(usn);
		System.out.println(srno);
		System.out.println(notification);
		
		
		RegisterBean rb = new RegisterBean();
		rb.setName(name);
		rb.setEmail(email);
		rb.setPassword(password);
		rb.setBranch(branch);
		rb.setCgpa(cgpa);
		rb.setFathername(fathername);
		rb.setMobilenumber(mobilenumber);
		rb.setSemester(semester);
		rb.setUsn(usn);
		rb.setSrno(srno);
		rb.setNotification(notification);
		
		UserDB ud = new UserDB();
		String s1 = ud.insertUser(rb);
		HttpSession session = request.getSession();
		session.setAttribute("email",email);
		request.getRequestDispatcher(WEB.NONOTIFICATION).forward(request, response);
		System.out.println(s1);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
		
	}

}
