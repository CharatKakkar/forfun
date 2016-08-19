<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    
</head>
<body>
<div class="navbar-wrapper">
    <div class="container">

        <nav class="navbar navbar-static-top">
            <div class="container">
              
              <p class="lead"> List of all the products</p>
<table class="table table-bordered table-striped table-hover ">
<thead >
<tr class= "bg-success">
<th> Product Name</th>
<th>Product Owner</th>
<th>Product Price </th>
<th></th>

</tr>
</thead>

<c:forEach items="${p1}" var= "p1" >
<tr>
<td>${p1.productName}</td>
<td>${p1.productOwner}</td>
<td>${p1.productValue }</td>
<td>  
 <a href="<spring:url value="/singleProductInfo/${p1.productId}"  />"><span class= "glyphicon glyphicon-list-alt "> </span></a></td>

</tr>
</c:forEach>
</table>
            </div>
        </nav>

    </div>
</div>


</body>
</html>