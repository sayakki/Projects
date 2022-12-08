<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
 <%@include file="menu.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Searching  Results</title>
</head>
<body>
     <h2>Bills!Search Result</h2>
     <table>
        <tr>
             <th>First Name</th>
             <th>Last Name</th>
             <th>Email</th>
             <th>Mobile</th>
             <th>Product Details</th>
             <th>Purchased Amount</th>
        </tr>
        
      <c:forEach items="${billings}" var="billy">
        <tr>
             <td>${billy.firstName}</td>
             <td>${billy.lastName}</td>
             <td>${billy.email}</td>
             <td>${billy.mobile}</td>
             <td>${billy.productName}</td>
             <td>${billy.amount}</td>
        </tr>
      
      </c:forEach>
     </table>
</body>
</html>