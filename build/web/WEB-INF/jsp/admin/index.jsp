<%@include file="/WEB-INF/jsp/bootstrap.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"/>
<!DOCTYPEHTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Admin Page</title>
    </head>
    <body>
        <button type="button" class="btn btn-primary" id="addproduct">Add Product to DB</button>
        <div class="form-group">
            <form action="${SITE_URL}/admin/add" method="POST" modelAttribute="add">
                <div>
                    <label>Product Name</label>
                    <input type="text" name="product_name">
                </div>
                <div>
                    <label>Product Category</label>
                    <input type="text" name="category">
                </div>  
                <div>
                    <label>Product Price</label>
                    <input type="text" name="product_price">
                </div>
                <div>
                    <label>Product Quantity</label>
                    <input type="text" name="product_qty">
                </div>
                <div>
                    <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-plus"</span></button>
                </div>
            </form>
        </div>
        <script src="../../assets/js/jquery-3.0.0.min.js" type="text/javascript"></script>
        <script>
            $("#addproduct").click(function () {
                $(".form-group").show();
            });
        </script>
    </body>
</html>