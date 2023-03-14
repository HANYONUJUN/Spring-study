<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>Hello world!</h1>

<h2 align="center">구구단</h2>
<table border="1">
<% for(int i=0; i<10; i++) {%>
<tr>
  <%for(int j=0; j<10; j++) { %>
  	<td>
      	<% out.println(j+"x"+i+"="+i*j); %>
      </td>
     	  <%} %>
     	</tr>
    <%} %>
</table>
</body>
</html>