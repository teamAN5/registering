<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Products</h1>
<table border="1">
<tr>
 <th> Product Id</th>
 <th>Product name</th>
 <th>Product Information</th>
 <th>product Amount</th>

 </tr>
 
 <c:forEach var="prods" items="${productList}" >
 <tr>
	 <td>${prods.productId }</td>
	 <td>${prods.productName }</td>
	 <td>${prods.productInfo }</td>
	 <td>${prods.productAmount }</td>
	 
 </tr>
 </c:forEach>
 </table>
 <br><br>

</body>
</html>