<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>1부터 10까지 더하기</title>
</head>
<body>
<%
      int sum=0;
      for (int i=0; i<=10; i++)
      {
    	sum=sum+i;  
      }
%>

<p>1부터 100까지 합:<%=sum %></p>
</body>
</html>
