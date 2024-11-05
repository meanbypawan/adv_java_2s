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
    <div class="container">
      <iframe style="width:100%;" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d14724.397440711475!2d75.85563204239313!3d22.68734482055874!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3962fce4e3fb47b5%3A0xc0233b393fbd54de!2sBhanwar%20Kuwa%2C%20Indore%2C%20Madhya%20Pradesh!5e0!3m2!1sen!2sin!4v1730813232342!5m2!1sen!2sin" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
    </div>
</body>
</html>

