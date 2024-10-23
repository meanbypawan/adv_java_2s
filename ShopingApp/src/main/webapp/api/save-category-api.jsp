<%@page import="dao.CategoryDAO"%>
<%@page import="java.lang.reflect.Type"%>
<%@page import="model.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.google.gson.reflect.TypeToken"%>
<%@page import="com.google.gson.JsonArray"%>
<%@page import="com.google.gson.Gson"%>
<%
  if(request.getMethod().equals("POST")){
	try{
	   Gson gson = new Gson();
	   JsonArray jsonArray = gson.fromJson(request.getReader(),JsonArray.class);
	   Type listType =  new TypeToken<ArrayList<Category>>(){}.getType();
	   ArrayList<Category> list= gson.fromJson(jsonArray, listType);
	   if(CategoryDAO.saveInBulk(list))
		   out.print("All Category Saved...");
	   else
		   out.println("Something wrong...");
	}
	catch(Exception e){
		e.printStackTrace();
	    out.print("Error....");
	}
  }
%>