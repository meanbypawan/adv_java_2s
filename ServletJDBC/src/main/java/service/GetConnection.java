package service;

import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletContext;

public class GetConnection {
  private static Connection con = null;
  public static Connection getConnection(ServletContext context) {
	  try {
		  String driver = context.getInitParameter("driver");
		  String dbUrl = context.getInitParameter("url");
		  String username = context.getInitParameter("username");
		  String password = context.getInitParameter("password");
		  Class.forName(driver);
		  con = DriverManager.getConnection(dbUrl,username,password);
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return con;
  }
}
