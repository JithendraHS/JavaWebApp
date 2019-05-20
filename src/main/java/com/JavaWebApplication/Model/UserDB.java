package com.JavaWebApplication.Model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.JavaWebApplication.Beans.RegisterBean;

public class UserDB {
	String s1 = null;
	String s2 = null;
	String s3 = null;
	public String insertUser(RegisterBean rb) {
		MyDb db = new MyDb();
		Connection con = db.getCon();
		try {
			Statement stmt = con.createStatement();
		    stmt.executeUpdate("insert into register(name,fatherName,branch,semester,cgpa,mobileNumber,email,password,usn,srno,notification) values ('"+rb.getName()+"','"+rb.getFathername()+"','"+rb.getBranch()+"','"+rb.getSemester()+"','"+rb.getCgpa()+"','"+rb.getMobilenumber()+"','"+rb.getEmail()+"','"+rb.getPassword()+"','"+rb.getUsn()+"','"+rb.getSrno()+"','"+rb.getNotification()+"')");
		    s1 = "Data inserted";
		}catch (SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s1;
	}
		public String Write(RegisterBean rb) {
			MyDb db = new MyDb();
			Connection con = db.getCon();
			try {
				Statement stmt = con.createStatement();
			    stmt.executeUpdate("update info set comments='"+rb.getComments()+"' where id='"+1+"'");
			    s1 = "Comments inserted";
			    System.out.println(s1);
			}catch (SQLException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return s1;
		}
	
	public String readData(RegisterBean user) {
		MyDb db = new MyDb();
		ResultSet rs;
		Connection con = db.getCon();
		Connection con1 = db.getCon();
		
		String id1;
		String not;
		int a = 1;
		try {
		//	System.out.println("sgssf");
		//Statement stmt = con.createStatement();
		  //   rs = stmt.executeQuery("select email,password from register where email = '"+user.getEmail()+"' and password = '"+user.getPassword()+"'");
		     
		  //   String email1=rs.getString("email");
		    // System.out.println( email1);
		   	String email=user.getEmail();
			String pass=user.getPassword();
			//String type="student";
			String notify=user.getNotification();
			
			 //System.out.println(email);
		     PreparedStatement st = con.prepareStatement("select * from register where email = '"+email+"'and password = '"+pass+"'");
		     ResultSet r1=st.executeQuery();
		     System.out.println(email);
		     System.out.println(pass);
	
		    if(r1.next()==true) {
		    	 id1 =  r1.getString("uid");
			    System.out.println(id1);
			     PreparedStatement st1 = con1.prepareStatement("select * from register where email = '"+email+"'and password = '"+pass+"'and notification = '"+notify+"'");
			     ResultSet r2=st1.executeQuery();
			     
			     System.out.println(notify);
			     if(r2.next()==true) {
			    	 System.out.println("success");
			    	 return "nonotify";
			     }
			     else {
			    	 System.out.println("nosuccess");
			    	 return "notify"; 
			     }     
		      }

		}catch (SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return "kkk";
	}
	public String readData1(RegisterBean user) {
		MyDb db = new MyDb();
		Connection con = db.getCon();
		String id1;
		int a = 1;
		try {
		
		   	String email=user.getEmail();
			String pass=user.getPassword();
			
			
			
			 //System.out.println(email);
		     PreparedStatement st = con.prepareStatement("select * from info where email = '"+email+"'and password = '"+pass+"'");
		     ResultSet r1=st.executeQuery();
		     System.out.println(email);
		     System.out.println(pass);
		     
		     
		     
		    if(r1.next()==true) {
		    	 return "allow";
			    }
			     else {
			    	 System.out.println("nosuccess");
			    	 return "not allow"; 
			     }     
		      
		}catch (SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return "kkk";
	}
	
	
	public String readInfo() {
		MyDb db = new MyDb();
		ResultSet rs;
		Connection con2 = db.getCon();
		String data;
		try {
			int i=1;
		     PreparedStatement st = con2.prepareStatement("select * from info where id = '"+i+"'");
		     ResultSet r3=st.executeQuery();
		     System.out.println("ok");
		     
		    if(r3.next()==true) {
		    	 data =  r3.getString("comments");
			    System.out.println(data);
			   return data;      
		      }
		      

		}catch (SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return "notok";
	}
}
/*if(notify=="null") {
	 System.out.println("success");
	 return "success";
}
else {
	 System.out.println("nosuccess");
	 return "nosuccess"; 
}*/
