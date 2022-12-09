<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SSeaarch Result</title>
</head>
<body>
     <h2>Lead !Search Result</h2>
     <table>
        <tr>
             <th>First Name</th>
             <th>Last Name</th>
             <th>Email</th>
             <th>Mobile</th>
             <th>Lead Source</th>
             <th>Gender</th>
        </tr>
        
      <c:forEach items="${contacts }" var="contact">
        <tr>
             <td>${contact.firstName}</td>
             <td>${contact.lastName}</td>
             <td>${contact.email}</td>
             <td>${contact.mobile}</td>
             <td>${contact.leadSource}</td>
             <td>${contact.gender}</td>
        </tr>
      
      </c:forEach>
     </table>
</body>
</html>