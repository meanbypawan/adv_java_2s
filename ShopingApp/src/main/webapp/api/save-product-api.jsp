<%@page import="dao.ProductDAO"%>
<%@page import="java.lang.reflect.Type"%>
<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.google.gson.reflect.TypeToken"%>
<%@page import="com.google.gson.JsonArray"%>
<%@page import="com.google.gson.Gson"%>
<%
 if(request.getMethod().equals("POST")){
  try{
	  Gson gson = new Gson(); 
	  JsonArray jsonArray =  gson.fromJson(request.getReader(), JsonArray.class);
      Type listType =  new TypeToken<ArrayList<Product>>(){}.getType();
      ArrayList<Product> al =  gson.fromJson(jsonArray, listType);
      if(ProductDAO.saveInBulk(al))
    	  out.print("All product saved successfully...");
      else
    	  out.print("Something wrong...");
  }
  catch(Exception e){
	e.printStackTrace();
  }
 }
 else
	 out.print("Something wrong | Invalid request");
%>