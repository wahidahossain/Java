<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />

<style type="text/css">

input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

#allPage {
	border-radius: 10px;
	padding: 10px;
	margin-right: auto;
	margin-left: auto;
	width: 980px;
	background-color: #B0CF78;
	opacity: 0.9;
	font-family:Verdana, Geneva, Tahoma, sans-serif
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

#register  {
 position:relative;
 left:0;
}

#login {
 position:relative;
 right:0;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

</style>

</head>

<body>

<div id="allPage" >

<h2>Student Register/Login</h3>

<div id="login" style="width: 30%; right: -614px; top: 15px;">

  <h3>Student Login</h3>
  <form action="${pageContext.request.contextPath}/loginStudent.html" method="post">
  
    <label for="userName">User name/Login name</label>
    <input type="text" id="loginNameId" name="loginName" placeholder="User name here...">


    <label for="password">Password</label><br>
    <input type="password" id="loginPasswordId" name="loginPassword" placeholder="Password here..." class="auto-style1" style="width: 292px; height: 38px"><br><br>
    
    <input type="submit" value="Login">

  </form>
</div>



<div id="register" style="width: 50%; left: 14px; top: -291px;">

  <h3>User name already exists! Try with a new User name.</h3>

 <form action="${pageContext.request.contextPath}/registerStudent.html" method="post">
  
<!--
    <label for="studentId">Student Id</label>
    <input type="text" id="studentIdId" name="studentId" placeholder="Student Id here...">
-->

    <label for="userName">User name/Login name</label>
    <input type="text" id="userNameId" name="userName" placeholder="User name here...">


    <label for="password">Password</label><br>
    <input type="password" id="passwordId" name="password" placeholder="Password here..." style="width: 487px; height: 38px"><br><br>


    <label for="firstname">First Name</label>
    <input type="text" id="firstnameId" name="firstname" placeholder="First name here...">


    <label for="lastname">Last Name</label>
    <input type="text" id="lastnameId" name="lastname" placeholder="Last name here...">


    <label for="address">Address</label>
    <input type="text" id="addressId" name="address" placeholder="Address here...">

  
    <label for="city">City</label>
    <input type="text" id="cityId" name="city" placeholder="City name here...">

    <label for="postalCode">Post Code</label>
    <input type="text" id="postalCodeId" name="postalCode" placeholder="Post code here..">

    <input type="submit" value="Submit">
  </form>
</div>

</div>
</body>

</html>
