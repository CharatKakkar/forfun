<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
  
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product Detail</h1>

            <p class="lead">Here is the detail information of the product!</p>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <img src="#" alt="image" style="width:100%; height: 300px" />
                </div>

                <div class="col-md-5">
                    <h3>${product.productName}</h3>
                    <p>${product.productDescription}</p>
                   
                    <p>
                        <strong>NAME</strong> : ${singleProduct.productName}
                    </p>
                    <p>
                        <strong>OWNER</strong> : ${singleProduct.productOwner}
                    </p>
                     <p>
                       <strong>PRICE</strong> : ${singleProduct.productValue}
                    </p>
                    
                </div>
            </div>
        </div>



