<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hi welcome to JSP Tags</h1>
	<!-- Declaration Tag -->
	
	<%! int a = 10; 
	
		public String test(){
			return "Hi I am called";
		}
		
		public void demo()
		{
			
		}
	%>
	
	<!-- Expression Tag -->
	
	<h2><%=a %></h2>
	
	<h2><%=test() %></h2>
	
	<!-- Scriptlet Tag -->
	
	<%
		int b = 20;
		out.print("Hello");
		out.print(b);
	%>
	
	<h2><%=b %></h2>
	
</body>
</html>