<%@page import="dao.OrderDAO"%>
<jsp:useBean id="order" class="model.OrderDetails"></jsp:useBean>
<jsp:setProperty name="order" property="*"></jsp:setProperty>
<%
try{
	Object userId =  session.getAttribute("currentUserId");
	   
	  order.setUserId(Integer.parseInt(userId.toString()));
	  if(OrderDAO.save(order)){%>
		 <script>
		   window.alert("Order placed successfully...");
		   window.location.href="../dashboard.jsp";
		 </script>  
	  <%}
	  else{%>
		<script>
		  window.alert("Oops! something went wrong..");
		  window.location.href="../dashboard.jsp";
		</script>  
	  <%}
	  }
	  catch(Exception e){
	   e.printStackTrace();
      }
%>