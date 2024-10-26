<%@page import="model.User"%>
<%@page import="dao.UserDAO"%>
<jsp:useBean id="user" class="model.User"></jsp:useBean>
<jsp:setProperty name="user" property="*"></jsp:setProperty>
<%
  if(request.getMethod().equals("POST")){
	 User u = UserDAO.authenticateUser(user);
     if(u!=null){
    	 session.setAttribute("currentUserId",u.getId());
    	 session.setAttribute("currentUserEmailId", u.getEmail());
    	 session.setAttribute("isLoggedIn", true);
    	 response.sendRedirect("../dashboard.jsp");
     }
     else
    	 out.print("Sign in failed....");
  }
  else
	  out.print("Something wrong | error.jsp");
%>