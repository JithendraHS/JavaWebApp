<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<title>Login page</title>

</head>

<body>
<h1>Login Here!</h1>
 <form method="post" action="http://localhost:8080/JavaWebApplication/Login">
  <div class="alert alert-primary" role="alert">
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email" placeholder="Enter email" required>
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="Password" required>
  </div>
  <!--  <div class="form-group">
    <label for="exampleInputEmail1">Login as</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name="type" placeholder="admin or student" required>
  </div>-->
   <!--   <div class="form-group form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1" name="checkbox">
    <label class="form-check-label" for="exampleCheck1">Check if you are admin</label>
  </div>-->
  <button type="submit" class="btn btn-primary">Login</button>
  </div>
</form>
</body>
</html>