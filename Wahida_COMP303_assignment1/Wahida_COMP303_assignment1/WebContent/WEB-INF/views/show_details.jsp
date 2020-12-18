<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Registration Successful</title>

<style type="text/css">
h1 {
	font-family: "Trebuchet MS", "Lucida Sans Unicode", "Lucida Grande", "Lucida Sans", Arial, sans-serif;
	font-size: 2em;
	font-variant: small-caps;
	text-transform: capitalize;
	color: #3E5702;
	/* 
	padding-left: 205px;
	height: 210px;
	*/
}
body {
	background-image: url('trilliumgradient.png');
}
#copyright {
	font-size: x-small;
	color: #669999;
}
.fieldLables {
	vertical-align: top;
	text-align: right;
}
#allPage {
	width: 980px;
	margin-right: auto;
	margin-left: auto;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
	color: #404040;
	
	box-shadow: 5px 5px 5px;
	border-radius: 10px;
	border: thin solid #336600;
	padding: 6px;

	
}
</style>

</head>

<body>

<div id="allPage">
<header>


	<h1>Member Registration Details</h1>


</header>


	<table id="allForm" style="width: 100%">
		<tr>
			<td class="fieldLables">Member's First Name:</td>
			<td>${MembershipBean.firstName}</td>
		</tr>
		<tr>
			<td class="fieldLables">Member's Last Name:</td>
			<td>${MembershipBean.lastName}</td>
		</tr>
		
		<tr>
			<td class="fieldLables">Street Address:</td>
			<td>${MembershipBean.streetAddress01}</td>
		</tr>
		
		<tr>
			<td class="fieldLables">Province:</td>
			<td>${MembershipBean.province}</td>
		</tr>
		<tr>
			<td class="fieldLables">Postal Code:</td>
			<td>${MembershipBean.postalCode}</td>
		</tr>
		<tr>
			<td class="fieldLables">Member Phone Number:</td>
			<td>${MembershipBean.phoneNumber}</td>
		</tr>
		<tr>
			<td class="fieldLables">E-mail:</td>
			<td>${MembershipBean.email}</td>
		</tr>
		<tr>
			<td class="fieldLables">Membership type:</td>
			<td>${MembershipBean.yearly} ${MembershipBean.monthly} ${MembershipBean.weekly}</td>
		</tr>
		<tr>
			<td class="fieldLables">CreditType:</td>
			<td>${MembershipBean.payment}</td>
		</tr>

	</table>


&nbsp;<footer><p id="copyright">&nbsp;Copyright 2020</p></footer>

</div>
</body>
</html>

