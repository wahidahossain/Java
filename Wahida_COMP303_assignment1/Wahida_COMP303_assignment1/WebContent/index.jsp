<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
 <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
 
<title>Online Gym Registration Form</title>
</head>
<body style="background-color:#f5f5f5">
<div class="container"><h2>Online Gym Registration Form</h2>
        <form action="${pageContext.request.contextPath}/placeorder" method="post">
  <div class="form-group">
    <label for="email">First Name:</label>
    <input class="form-control" type="text" name="firstName" placeholder="your first Name" required="required">
  </div>
  <div class="form-group">
    <label for="email">Last Name:</label>
    <input class="form-control" type="text" name="lastName" placeholder="your last Name">
  </div>
  <div class="form-group">
    <label for="email">Street Address:</label>
    <input class="form-control" type="text" name="streetAddress01" placeholder="Apt no, House, street">
  </div>
  
  <div class="form-group">
    <label for="exampleFormControlSelect1">Select province</label>
    <select name="province" class="form-control" id="exampleFormControlSelect1">
    <option>Select</option>
      <option>ON</option>
		<option>BC</option>
		<option>NS</option>
    </select>
  </div>
  
  <div class="form-group">
    <label for="email">Postal Code:</label>
    <input class="form-control" type="text" name="postalCode" placeholder="Postal code : A0B 0X0">
  </div>
   <div class="form-group">
    <label for="email">Phone Number:</label>
    <input class="form-control" type="text" name="phoneNumber" placeholder="416 XXX XXXX">
  </div>
  
  <div class="form-group">
    <label for="email">Email address:</label>
    <input type="email" class="form-control" id="email" name="email">
  </div>
  
  <div class="form-group">
    <label for="Membership">Membership:</label>
     <input class="form-check-input position-static" name="yearly" type="checkbox" tabindex="1" value="1" id="blankCheckbox" > Yearly,
  <input class="form-check-input position-static" name="monthly" type="checkbox" tabindex="1" value="1" id="blankCheckbox" > Monthly,
  <input class="form-check-input position-static" name="weekly" type="checkbox" tabindex="1" value="1" id="blankCheckbox" > Weekly.
  </div>
  
  <div class="form-group">
    <label for="Membership">How would you like to pay? Credit Card: </label>
     <input class="form-check-input position-static" name="payment" type="radio" tabindex="1" value="1" id="blankCheckbox" > Master Card,
  <input class="form-check-input position-static" name="payment" type="radio" tabindex="1" value="2" id="blankCheckbox" > VISA,
  <input class="form-check-input position-static" name="payment" type="radio" tabindex="1" value="3" id="blankCheckbox" > Americal Express.
  </div>
  
  
 
  <button type="submit" class="btn btn-default" name="Order" value="Order">Submit</button>
</form>
        
        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </div>
</body>
</html>