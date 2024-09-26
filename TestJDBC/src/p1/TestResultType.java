package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.UserDAO;
/*
   ResultSet: -
     next(),previous()
     getInt(), getString(), getFloat()...
     afterLast()
     beforeFirst()
     absolute()
     relative() 
     isBeforeFirst() : true|false
     isAfterLast() : true | false
 */
public class TestResultType {
  public static void main(String args[]) {
	  try(Connection con = GetConnection.getConnection();) {
		  String sql = "select * from user";
		  PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE);
		  ResultSet rs =  ps.executeQuery();
		  //System.out.println(rs.isBeforeFirst());
	      //rs.absolute(3);
	      //rs.relative(-1);
	      rs.afterLast();
	      while(rs.previous())
		    System.out.println(rs.getInt(1)+" "+rs.getString(2));
	      
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  
  }
}
