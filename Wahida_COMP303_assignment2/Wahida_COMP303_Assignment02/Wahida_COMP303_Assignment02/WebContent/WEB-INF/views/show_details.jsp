<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Successful Payment Details </title>

<style type="text/css">
div {
  border: 1px solid gray;
  padding: 8px;
}

h1 {
  text-align: center;
  text-transform: uppercase;
  color: #4CAF50;
}

p {
  text-indent: 50px;
  text-align: justify;
  letter-spacing: 3px;
}

a {
  text-decoration: none;
  color: #008CBA;
}

#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style>

</head>

<body>
<div>

<header>
	<h1>Student Details</h1>
</header>
<h3>Payment Successful!!!</h3>
<h2>Thank you ${Students.firstname}  ${Students.lastname} for your application in ${Programs.programName}</h2>
<form>
	<table id="customers">
		<tr>
			<td class="fieldLables">User Name:</td>
			<td>${Students.userName}</td>
		</tr>
		<tr>
			<td class="fieldLables">Password:</td>
			<td>${Students.password}</td>
		</tr>
		
		<tr>
			<td class="fieldLables">First Name:</td>
			<td>${Students.firstname}</td>
		</tr>
		<tr>
			<td class="fieldLables">Last Name:</td>
			<td>${Students.lastname}</td>
		</tr>
		<tr>
			<td class="fieldLables">Address:</td>
			<td>${Students.address}</td>
		</tr>
		<tr>
			<td class="fieldLables">City:</td>
			<td>${Students.city}</td>
		</tr>
		<tr>
			<td class="fieldLables">Postal Code:</td>
			<td>${Students.postalCode}</td>
		</tr>

	</table>
</form>

&nbsp;<footer><p id="copyright">&nbsp;©Copyright 2020, COMP 303, Wahida Hossain</p></footer>

</div>
</body>
</html>

