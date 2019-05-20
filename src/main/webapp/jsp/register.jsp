<%@ page language="java" contentType ="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <html>
  <head>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
  <title>Register page</title>
  </head>
  <body>
  <h2>Register Here</h2>
  <form method="post" action="http://localhost:8080/JavaWebApplication/Register">
  <div class="alert alert-primary" role="alert">
 
  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name" placeholder="Enter your name" required >
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Father Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="fathername" placeholder="Enter your father name" required>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Branch</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="branch" placeholder="Enter your branch" required>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Semester</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="semester" placeholder="Enter your semester" required>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">USN</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="usn" placeholder="Enter your USN" required>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">SR no</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="srno" placeholder="Enter your SR no" required>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">CGPA</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="cgpa" placeholder="Enter your CGPA" required>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Mobile No</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="mobilenumber" placeholder="Enter your mobile number" required>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email" placeholder="Enter email" required>
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="Password" required>
  </div>
  <button type="submit" class="btn btn-primary">SignUp</button>
  <a href="http://localhost:8080/JavaWebApplication/jsp/contact.jsp" class="alert-link"></a>
  
  </div>
</form>
<!--   <form  method="post" action="http://localhost:8080/JavaWebApplication/Register" >
  <pre>
 Name:          <input type="text" name="name" placeholder="Enter your name" >
 Father Name:   <input type="text" name="fathername" placeholder="Enter your father name">
 Branch:        <input type="text" name="branch" placeholder="Enter your engneering branch" >
 Semester:      <input type="text" name="semester" placeholder="Enter your semester" >
 USN:           <input type="text" name="usn" placeholder="Enter your usn" >
 Sr no:         <input type="text" name="srno" placeholder="Enter your Sr no" >
 CGPA:          <input type="text" name="cgpa" placeholder="Enter your CGPA">
 Mobile Number: <input type="text" name="mobilenumber" placeholder="Enter your mobile number" >
 Email:         <input type="email" name="email" placeholder="Enter your email" >
 Password:      <input type="password" name="password" placeholder="Enter your password" >
 
<input type="submit" value="signUp">
  
  </pre>-->
  
  </body>
  </html>