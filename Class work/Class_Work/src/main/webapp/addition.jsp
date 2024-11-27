<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int i=0,j=0,k=0; %>
<%
	i = Integer.parseInt(request.getParameter("n1"));
	j = Integer.parseInt(request.getParameter("n2"));
	k=i+j;
%>
<h1> Sum of two number is : <%=k %> </h1>

</body>
</html>