<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<%
       for(int i =2 ; i <= 1000; i++){
    	   boolean bprime = true;
    	   for(int j=2; j<i; j++){
    		   if(i % j ==0){
    			   bprime = false;
    			   break;
    		   }
    	   }
    	   if(bprime){
    		   out.println(i+ "<BR>");
    	   }
       }
%>
</body>
</html>