<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>
<body>
<%
 response.setHeader("Cache-control","no-cache");
response.setHeader("Cache-control","no-store");
response.setHeader("pragma","no-cache");
response.setDateHeader("Expire",0);
String email = (String)session.getAttribute("email");
if(email ==null){
	System.out.println("email");
	response.sendRedirect("http://localhost:8080/javaWebApplication/logout.jsp");
}

%>
<h1>Welcome home<%out.println(email); %></h1>

<a href="index.jsp" <%

session.invalidate();

%>>Logout</a>
</body>
</html>