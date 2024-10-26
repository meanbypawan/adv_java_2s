<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <%@include file="__bootstrap.jsp" %>
</head>
<body>
   
   <%@include file="__header.jsp" %>
   <%if(isLoggedIn!=null){ %>
   <div class="container mt-3">
     <form action="controller/place-order-action.jsp" method="post">
       <input type="hidden" name="productId" value=<%=request.getParameter("productId")%>>
       <input type="hidden" name="billAmount" value=<%=request.getParameter("billAmount") %>>
       
       <div class="form-group">
         <label>Enter name</label>
         <input name="name" type="text" class="form-control"/>
       </div>
       <div class="form-group">
         <label>Enter contact number</label>
         <input name="contact" type="text" class="form-control"/>
       </div>
       <div class="form-group">
         <label>Enter delivery address</label>
         <input name="deliveryAddress" type="text" class="form-control"/>
       </div>
       <div class="form-group">
        <button class="btn btn-warning">Place order</button>
       </div>
     </form>
   </div>
   <%}else{
	   response.sendRedirect("signin.jsp");
   } %>
</body>
</html>