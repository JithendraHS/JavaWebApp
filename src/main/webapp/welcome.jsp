<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome page</title>
</head>
<body>
<%
 response.setHeader("Cache-control","no-cache");
response.setHeader("Cache-control","no-store");
response.setHeader("pragma","no-cache");
response.setDateHeader("Expire",0);
String data = (String)session.getAttribute("data");
//if(email==null){
	//System.out.println("email");
//	response.sendRedirect("http://localhost:8080/javaWebApplication/index.jsp");
//}
 

%>
  <h3>Welcome <%out.println(data); %></h3>
<p>Wrong username or password<br>To try again </p>

<a href="index.jsp">click here</a>
</body>
</html>