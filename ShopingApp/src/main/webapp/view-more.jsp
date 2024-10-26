<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductDAO"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <%@include file="__bootstrap.jsp" %>
</head>
<body>
 <%@include file="__header.jsp" %>
 <%
   int id = Integer.parseInt(request.getParameter("id"));
   Product p = ProductDAO.getProduct(id);
   ArrayList<String> imageList = p.getImages();
 %>
 <div class="container mt-3">
   <div class="row">
     <div class="col-md-6 d-flex flex-column" style="box-shadow:10px 10px 10px grey; height:500px;">
       <img src="<%=p.getThumbnail()%>" style="width:100%; height:400px;"/>
       <div class="d-flex flex-row justify-content-center align-items-center">
         <%for(String imageUrl : imageList){ %>
           <img src="<%=imageUrl%>" style="width:30%; height:80px;"/>
         <%}%>
       </div>
     </div>
     <div class="col-md-6 p-3" style="box-shadow:10px 10px 10px grey; height:500px;">
      <div class="d-flex justify-content-between">
        <label><strong style="font-size:18px;"><%=p.getTitle() %>[<%=p.getBrand() %>]</strong></label>
        <label><del class="text-danger"><%=p.getPrice() %>Rs.</del></label>
      </div>
      <p><b>Category : </b><%=p.getCategory().toUpperCase() %></p>
      <p style="font-size: 15px;"><%=p.getDescription() %></p>
      <p><b>Warranty Info : </b><%=p.getWarrantyInformation() %></p>
      <p><b>Shipping Info : </b><%=p.getShippingInformation() %></p>
      <p><b>Availability Info : </b><%=p.getAvailabilityStatus() %></p>
      <p><b>Rating : </b><%=p.getRating() %></p>
      <p><b>Stock : </b><%=p.getStock() %></p>
      <p><b>Discount : </b><label class="text-primary" style="font-weight: bold;"><%=p.getDiscountPercentage() %></label></p>
      <p><b>After discount : </b><label class="text-success" style="font-size:20px; font-weight:bold;"><%=(p.getPrice()-( p.getPrice() * p.getDiscountPercentage() )/100)%> Rs.</label></p>
      <div class="text-center">
       <a href="place-order.jsp?productId=<%=p.getId()%>&billAmount=<%=(p.getPrice()-( p.getPrice() * p.getDiscountPercentage() )/100)%>">
         <button class="btn btn-warning" style="width:100% !important;">Buy now</button>
       </a>
      </div>
     </div>
   </div>
 </div> 
</body>
</html>