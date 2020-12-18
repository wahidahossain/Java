<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <html><head>
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
a:link {
  color: red;
}

/* visited link */
a:visited {
  color: green;
}

/* mouse over link */
a:hover {
  color: hotpink;
}

/* selected link */
a:active {
  color: blue;
}
</style>
    </head>
<body>

<div id="allPage" >

<h2>Pay for the course</h2>

<div>
<button><a href=edit_Info.html> Edit Profile</a></button>
</div>
<div id="programs">
<form action="${pageContext.request.contextPath}/payForTheCourse.html" method="post">

    	<label for="">Card Number</label>
		<input type="text" name="cardNumber" required>		
	    <label for="">Pay Amount</label>
		<input type="text" name="payAmount" required>
		
    <input type="submit" value="Pay">
 </form>
 
<form>
	<table id="customers" style="width: 100%">
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

</div>








</div>
</body>
</html>
