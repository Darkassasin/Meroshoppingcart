<%@page import="com.leapfrog.nepalishoppingcart.DAO.impl.productdaoimpl"%>
<%@page import="com.leapfrog.nepalishoppingcart.DAO.ProductDAO"%>
<%
    ProductDAO productDAO=new productdaoimpl();
    productDAO.insert(p);
%>