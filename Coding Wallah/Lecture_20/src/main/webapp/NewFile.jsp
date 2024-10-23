<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
  font-size: 40px;
  text-align:center;
  background: linear-gradient(to right,  #2b40ff,#07121a);
}
h1,h3{
color: white;
margin:40px;
}
input, button {
  font-size:40px;
  color: white;
  border-radius: 5%;
  background-color: black;
  border: 2px solid white;
}
</style>
</head>
<body>
	<H1> JSP Page Calculator</H1>
	<form action ="Myservlet">
		<input name = "num1" placeholder = "Enter number"></input>
		<input name ="num2" placeholder ="Enter number"></input>
		<button name="bt1" value="1"> + </button>
    	<button name="bt1" value="2"> - </button>
    	<button name="bt1" value="3"> * </button>
    	<button name="bt1" value="4"> / </button>
	</form>
	<h1>Ans=<%=request.getParameter("ans")%> </h1>
	
</body>
</html>