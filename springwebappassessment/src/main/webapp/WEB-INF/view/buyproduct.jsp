<%@page import="com.ustglobal.rms.bean.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./buy" style="margin-left: 450px;margin-top: 100px;">
<a href="./home">Home</a>
<a href="./logout">Logout</a>
<%Product product=(Product)request.getAttribute("myproduct"); %>
<table>
<tr>
<th>Pname</th>
<th>Price</th>
<th>Quantity</th>
<th>buy</th>
</tr>
<tr>
<td><%=product.getPname() %></td>
<td><%=product.getPrice() %></td>
<td><input type="number" name="quantity"></td>
<td><a href="./buyproduct?pname=<%=product.getPname()%>">buy</a></td>
</tr>
</table>
</form>
</body>
</html>