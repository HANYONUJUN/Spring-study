<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>lotto</h1>

     <% 
           //배열크기 정의
           int LottoNumber[] = new int[6];
           
     	   //랜덤함수 정의
           Random ran = new Random();
     	   
     	  for(int i =0; i<LottoNumber.length; i++){
     		  LottoNumber[i]=(int)(Math.random()*45)+1;
     		  
     		for(int j=0; j<i; j++){
     			if(LottoNumber[i]==LottoNumber[j]){
     				i--;
     				break;
     		   }
     		}
     	 }
     	  
     	  for(int i=0; i<LottoNumber.length; i++){
     		  out.println("["+LottoNumber[i]+"]");
     	  }
     	   
     %>
      


</body>
</html>