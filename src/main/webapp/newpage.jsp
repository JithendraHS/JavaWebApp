<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin page </title>
<style type="text/css">
/* Set a background image by replacing the URL below */
body {
  background: url('https://source.unsplash.com/twukN12EN7c/1920x1080') no-repeat center center fixed;
  -webkit-background-size: cover;
  -moz-background-size: cover;
  background-size: cover;
  -o-background-size: cover;
}
</style>
</head>
<body>
<%
 response.setHeader("Cache-control","no-cache");
response.setHeader("Cache-control","no-store");
response.setHeader("pragma","no-cache");
response.setDateHeader("Expire",0);
String email = (String)session.getAttribute("email");
//if(email ==null){
//	System.out.println("email");
	//response.sendRedirect("http://localhost:8080/javaWebApplication/index.jsp");
//}

%>
<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-light bg-light static-top mb-5 shadow">
  <div class="container">

<!-- Page Content -->
  <!--<div class="container">
  <div class="card border-0 shadow my-5">
    <div class="card-body p-5">
      <h1 class="font-weight-light">Notification</h1>
      <form action="http://localhost:8080/JavaWebApplication/Login" method="post">
      <textarea name="comments" id="comments"  placeholder="Edit here" style="width:96%;height:150px;padding:2%;font-size:1.2em;background:url('/pix/samples/celebrate.gif');background-position:center center;background-repeat:no-repeat;">
      Edit here
      </textarea>
      
      <input type="submit" value="Upload">
      </form>
      <div style="height: 150px"></div>
      <h3>Welcome <%out.println(email); %></h3>
      <a href="index.jsp" <%session.invalidate();%>>Logout</a>
    </div>-->
  </div>
  <form method="post" action="http://localhost:8080/JavaWebApplication/Newpage">
  <div class="alert alert-primary" role="alert">
  <div class="form-group">
    <label for="exampleInputEmail1">Comments</label>
    <textarea type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="comments" style="width:96%;height:150px;padding:2%;font-size:1.2em;background:url('/pix/samples/celebrate.gif');background-position:center center;background-repeat:no-repeat; placeholder="Edit here " required >
    
  </textarea>
  </div>
  <button type="submit" class="btn btn-primary">upload</button>
  </div>
  <a href="index.jsp">Logout</a>
</form>
</div>


</body>
</html>