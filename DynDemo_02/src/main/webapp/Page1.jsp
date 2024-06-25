<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page 1</title>
</head>
<body>
	<h1>Welcome to JSP</h1>
	<%
	for(int t=0;t<5;t++) {
		if(t%2==0) {
			%>
			<div style="color: green"><%=t %> <br></div>
			<%
		}
		else {
			 %>
			 <div style="color: blue"><%=t %> <br></div>
		<%
		}
	}
	%>
</body>
</html>