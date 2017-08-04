<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="bootstrap.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"/>

<html>
    <head>
        <title>नेपाली सपिंग कार्त </title>
    </head>

    <body>
        <center><h1><b>नेपाली सपिङ कार्तमा स्वागत छ !!!</b></h1></center>
        <h1>निम्न लिखित वस्तुहरुबाट छान्नुहोस:</h1>

        <c:forEach var="product" items="${products}">
            <div class="col-md-3" style=" border:1px solid; margin:  5px 5px 5px;">
                <div id="productblock">
                    <ul style="list-style: none">
                        <li><Strong>${product.product_name}</strong></li><br>
                        <li><b>Rs.</b>${product.product_price}</li><br>
                        <li><b>Category:</b>${product.category}</li>
                    </ul>
                    <form target='paypal' action='https://www.paypal.com/cgi-bin/webscr' method='post'>
                    <input type='hidden' name='business' value='kin@kinskards.com'>
                    <input type='hidden' name='cmd' value='_cart'>
                    <input type='hidden' name='add' value='1'>
                    <input type='hidden' name='item_name' value='${product.product_name}'>
                    <input type='hidden' name='amount' value='${product.product_price}'>
                    <input type='hidden' name='currency_code' value='USD'>
                    <button class="btn btn-primary" value="buy" style="width:100%;">Add to cart <span class="glyphicon glyphicon-plus"></span></button>
                </form>
                </div>
            </div>
        </c:forEach>
        <a href="${SITE_URL}/admin/index"><button class="btn btn-primary">Update DB</button></a>
        <a href="${SITE_URL}/uploadimage"><button class="btn btn-primary">Update Image</button></a>
    </body>
</html>
