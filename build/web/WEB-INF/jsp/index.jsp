<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="bootstrap.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
    </head>

    <body>
        <center><h1><b>नेपाली सपिङ कार्तमा स्वागत छ !!!</b></h1></center>
        <%/*
   // Set refresh, autoload time as 1 seconds
   response.setIntHeader("Refresh", 1);
   // Get current time
   String hr,mins;
   String sec;
   Calendar calendar = new GregorianCalendar();
   String am_pm;
   int hour = calendar.get(Calendar.HOUR);
   int minute = calendar.get(Calendar.MINUTE);
   int second = calendar.get(Calendar.SECOND);
   if(minute<10 ){
       mins="0"+minute;
   }
   else{
       mins=""+minute;
   }
   if(second<10){
       sec="0"+second;
   }else{
       sec=""+second;
   }
   if(hour<10){
       hr="0"+hour;
   }else{
       hr=""+hour;
   }
   if(calendar.get(Calendar.AM_PM) == 0)
      am_pm = "AM";
   else
      am_pm = "PM";
   String CT = hr+":"+ mins +":"+ sec +" "+ am_pm;
   out.println("Current Time: " + CT + "\n");*/
%>
        <h1>निम्न लिखित बस्तुहरुबाट छान्नुहोस:</h1>

    <c:forEach var="product" items="${products}">
        <div class="col-md-3">
            <div id="productblock" style="border:1px solid #ccc;">
                <ul style="list-style: none">
                    <li>${product.product_name}</li><br>
                    <li><b>Rs.</b>${product.product_price}</li><br>
                    <li><b>Category:</b>${product.category}</li>
                </ul>
            </div>
            <button class="btn btn-primary" value="buy">Add to cart <span class="glyphicon glyphicon-plus"></span></button>
        </div>
    </c:forEach>
</body>
</html>
