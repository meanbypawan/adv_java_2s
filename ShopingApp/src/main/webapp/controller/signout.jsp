<%
   session.setAttribute("isLoggedIn", null);
   session.setAttribute("currentUserId", null);
   session.setAttribute("currentUserEmailId", null);
   session.invalidate();
   response.sendRedirect("../dashboard.jsp");
%>