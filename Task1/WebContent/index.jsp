<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
 <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>

<title>Online Job application Form</title>
</head>
<body style="background-color:#f5f5f5">
<div class="container"><h2>Online Job application Form</h2>
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
    <label for="exampleFormControlSelect1">Which position you applied for?</label>
    <select name="position" class="form-control" id="exampleFormControlSelect1">
    <option>Select</option>
      <option>Designer</option>
		<option>HR</option>
		<option>Administrator</option>
		<option>Software Engineer</option>
    </select>
  </div>
  
 
  
  <div class="form-group">
    <label for="email">Email address:</label>
    <input type="email" class="form-control" id="email" name="email">
  </div>
  
  
  
  <div class="form-group">
    <label for="Membership">What annual salary($) you are looking for? </label>
     <input class="form-check-input position-static" name="payment" type="radio" tabindex="1" value="1" id="blankCheckbox" > Between 1000 -2000 ($),
  <input class="form-check-input position-static" name="payment" type="radio" tabindex="1" value="2" id="blankCheckbox" > Between 2000 -2500 ($),
  <input class="form-check-input position-static" name="payment" type="radio" tabindex="1" value="3" id="blankCheckbox" > Between 2500 -3000 ($),
  <input class="form-check-input position-static" name="payment" type="radio" tabindex="1" value="3" id="blankCheckbox" > More than 3000 ($),
  </div>
  
  
 
  <button type="submit" class="btn btn-default" name="Order" value="Order">Submit</button>
</form>
        
        <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </div>
</body>
</html>