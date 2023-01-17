<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>get data sucessfully</h1>
<table>
<thead>
<h1>ID</h1>
<h1>PWD</h1>
<h1>NAME</h1>
<h1>EMAIL</h1>
</thead>
<tbody>
<c:forEach items="${list}" var="t">

<tr>
<td>${t.id}</td>
<td>${t.pwd}</td>
<td>${t.name}</td>
<td>${t.email}</td>
</tr>

</c:forEach>


</tbody>

</table>
</body>
</html>