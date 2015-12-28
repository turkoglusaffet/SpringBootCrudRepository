<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hello</title>
</head>
<body>
<div class="success">
		<br/>
		Would you like to <a href="<c:url value='/newUser' />">Add Some Users</a> to keep yourself busy?
		<br/>
	</div>
</body>
</html>