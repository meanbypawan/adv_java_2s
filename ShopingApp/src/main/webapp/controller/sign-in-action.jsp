<jsp:useBean id="user" class="model.User"></jsp:useBean>
<jsp:setProperty name="user" property="email,password"></jsp:setProperty>
<%
  if(request.getMethod().equals("POST")){
	   
  }
  else
	  out.print("Something wrong | error.jsp");
%>