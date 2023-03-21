<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Boot Strap 2</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
</head>
<body>
<div class="container p-5 bg-primary text-white text-center"> 
    	<h1>Login Form</h1>
     <form action="Servlet1" method="get">
		
     <div class="mb-3">
  		<label for="UserName" class="form-label">User Name</label>
  		<input type="text" class="form-control" id="uname1" placeholder="User Name" name=uname1>
	</div>
	<div class="mb-3">
  		<label for="password" class="form-label">Password</label>
  		<input type="password" class="form-control" id="password1" placeholder="Password" name=password1>
	</div>
	
	<div class="mb-3">
		<button type="submit" class="btn btn-success">Register</button>
		<button type="reset" class="btn btn-danger">Clear</button>	
	</div>
	</form>
</div>
</body>
</html>