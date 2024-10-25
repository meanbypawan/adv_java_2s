<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <%@include file="__bootstrap.jsp"%>
   <style>
   *{
     margin:0;
   }
   </style>
</head>
<body>
    <%@include file="__header.jsp" %>
    <%
     ArrayList<Product>al =  ProductDAO.getProductList();
    %>
    <div class="container mt-3">
      <div class="row">
             <%for(Product p: al){%>
              <div class="col-md-3 p-2">
               <div class="d-flex flex-column align-items-center" style="box-shadow: 10px 10px 10px grey; height: 300px;">
                 <img src="<%=p.getThumbnail()%>" style="width:100%; height:200px;"/>
                 <h6 class="text-center mt-2"><%=p.getTitle() %></h6>
                 <label class="text-success"><strong><%=p.getPrice() %> Rs.</strong></label>
                 <a href="./view-more.jsp?id=<%=p.getId()%>" style="width:100%;">
                  <button class="btn btn-warning" style="width:100%;">View more</button>
                 </a>
               </div>
             </div>
             <%}%>
          
      </div>
    </div>
</body>
</html>

