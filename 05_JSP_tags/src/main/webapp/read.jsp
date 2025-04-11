<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>User Details</h1>

	<%!
		String name = null;
		String email = null;
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException 
		{
			name = request.getParameter("uname");
			email = request.getParameter("uemail");
		}
		
		public void test(){
			List<String> list = new ArrayList<>();
		}
	
	%>
		
	<%
		doPost(request, response);
	%>

	<h3>
		Name :
		<%=name%></h3>
	<h3>
		Email :
		<%=email%></h3>

</body>
</html>