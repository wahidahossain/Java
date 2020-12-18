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



<div id="register" >

  <h3>Edit Profile</h3>
	
 <form action="${pageContext.request.contextPath}/edit.html" method="post">
  
<!--
    <label for="studentId">Student Id</label>
    <input type="text" id="studentIdId" name="studentId" placeholder="Student Id here...">
-->

    <label for="userName">User name/Login name</label>
    <input type="text" id="userNameId" name="userName" readonly value=${Students.userName}>


    <label for="password">Password</label><br>
    <input type="password" id="passwordId" name="password"  style="width: 487px; height: 38px" required value=${Students.password}><br><br>


    <label for="firstname">First Name</label>
    <input type="text" id="firstnameId" name="firstname"  required value=${Students.firstname}>


    <label for="lastname">Last Name</label>
    <input type="text" id="lastnameId" name="lastname" required value=${Students.lastname}>


    <label for="address">Address</label>
    <input type="text" id="addressId" name="address" required value=${Students.address}>

  
    <label for="city">City</label>
    <input type="text" id="cityId" name="city"  required value=${Students.city}>

    <label for="postalCode">Post Code</label>
    <input type="text" id="postalCodeId" name="postalCode"  required value=${Students.postalCode}>

    <input type="submit" value="Submit">
  </form>
</div>

</div>
</body>

</html>

