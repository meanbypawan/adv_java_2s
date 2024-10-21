<%@page import="dao.UserDAO"%>
<%@page import="model.User"%>

<jsp:useBean id="user" class="model.User"></jsp:useBean>
<jsp:setProperty name="user" property="*"></jsp:setProperty>
<%
  if(request.getMethod().equals("POST")){
	 if(UserDAO.save(user)){%>
	   <script>
	     window.alert("Sign up success...");
	     window.location.href="../signin.jsp";
	   </script>	  
	 <%}
     else
		 out.print("Sign up failed....");
  }
  else
	 out.print("<h1>Can not handle GET</h1>");  
%>