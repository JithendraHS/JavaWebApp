<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Notification page</title>
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
String data = (String)session.getAttribute("data");
//if(email ==null){
//	System.out.println("email");
	//response.sendRedirect("http://localhost:8080/javaWebApplication/index.jsp");
//}

%>
<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-light bg-light static-top mb-5 shadow">
  <div class="container">
  
  
  </div>
</nav>

<!-- Page Content -->
<div class="container">
  <div class="card border-0 shadow my-5">
    <div class="card-body p-5">
      <h1 class="font-weight-light">Notification for you...</h1>
     <!--<h2 class="font-weight-light">Invitation for Students to Partication in Blockchain Hackathon - Genesis Hack</h2>
      <p class="lead">IBC Media - a media company for emerging tech in India. students of SJCE to participate in the world's biggest blockchain hackathon Genesis Hack.</p>
      <p class="lead">Genesis Hack is a 6-month-long blockchain hackathon that is focused on fostering learning and innovation in the field of blockchain technology. The winners of Genesis Hack will be rewarded with cash prizes from an overall sum of Rs 1.57 Crores.</p>
      <p class="lead">The hackathon has three tracks:</p>
      <p class="lead">1.The Protocol Track: Participants can build a blockchain protocol from scratch, or pick an existing one and make it better.</p>
      <p class="lead">2.The dApp Track: Participants will build dApps with relevant use cases.</p>
      <p class="lead">3.The Security Track: Participants will build airtight security for existing blockchain applications and protocols</p>
      <p class="lead">The participants of the event will be showcasing their skills to big names in the blockchain space like Microsoft, Tech Mahindra, Marlin Protocol, Holochain, and more. This will open up a lot of career opportunities for your students in blockchain development.</p>-->
      <h3><%out.println(data); %></h3>
      <a href="index.jsp" <%session.invalidate();%>>Logout</a>
      <div style="height: 700px"></div>
     <!--   <p class="lead mb-0">You've reached the end!</p>-->
      
<!--  <h1>Notification</h1>
<a  href="https://www.digit.in/">click here</a>-->
 <h1>Welcome <%out.println(data); %></h1>



    </div>
  </div>
</div>

</body>
</html>