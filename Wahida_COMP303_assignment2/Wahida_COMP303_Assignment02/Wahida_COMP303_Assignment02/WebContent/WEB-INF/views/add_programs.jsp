<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />

<!-- <style type="text/css">

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

</style>-->

<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>

</head>

<body>
<div class="container">


<h2>Programs</h3>


<form action="${pageContext.request.contextPath}/addProgram.html" method="post">
    <label for="">Program Name</label>
    <select id="programName" name="programName">
      <option value="1">Software Engineering Technology</option>
      <option value="2">Game Development</option>
      <option value="3">Mobile Applications Development</option>
      <option value="4">Cybersecurity</option>
      <option value="5">Health Informatics Technology</option>
    </select>
  
    <input type="submit" value="Select Program">
 </form>










</div>
</body>

</html>
