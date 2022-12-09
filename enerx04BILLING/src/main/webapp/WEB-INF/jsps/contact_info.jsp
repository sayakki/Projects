<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Info</title>
</head>
<body>
   <h2>Contact ! Info</h2>
   First Name:${contact.firstName}<br/>
   last Name:${contact.lastName}<br/>
   lead Source:${contact.leadSource}<br/>
   Email:${contact.email}<br/>
   Mobile:${contact.mobile}<br/>
   Gender:${contact.gender}<br/>
   
   <form action="convertLead" method="post">
        <input type="hidden" name="id" value="${contact.id}"/>
        <input type="submit" value="convert"/>
   
   </form>
</body>
</html>