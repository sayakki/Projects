<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<body>
	<h2>Billing Details</h2>
	<form>
	<pre>
		First Name<input type="text" name="firstName" value="${billings.firstName }"/>
		Last Name<input type="text" name="lastName" value="${billings.lastName }"/>
		Email<input type="text" name="email" value="${billings.email }"/>
		Mobile<input type="text" name="mobile" value="${billings.mobile }"/>
		Product Name<input type="text" name="productName"  value="${billings.productName }"/>
		Amount<input type="text" name="amount" value="${billings.amount }"/>
	</pre>
	</form>
</body>
</html>