<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Information</title>
</head>
<body>
   <h2>Lead ! Info</h2>
   First Name:${lead.firstName}<br/>
   last Name:${lead.lastName}<br/>
   lead Source:${lead.leadSource}<br/>
   Email:${lead.email}<br/>
   Mobile:${lead.mobile}<br/>
   Gender:${lead.gender}<br/>  
   
   <form action="convertLead" method="post">
        <input type="hidden" name="id" value="${lead.id}"/>
        <input type="submit" value="convert"/>
   </form>
</body>
</html>