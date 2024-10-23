<%@page import="com.google.gson.Gson"%>
<%@page import="dao.CategoryDAO"%>
<%@page import="model.Category"%>
<%@page import="java.util.ArrayList"%>
<%
   if(request.getMethod().equals("GET")){
	   ArrayList<Category> al = CategoryDAO.getCategoryList();
	   Gson gson = new Gson();
	   String json = gson.toJson(al);
       out.print(json);
   }
%>