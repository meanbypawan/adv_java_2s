package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.ResultSetMetaData;

public class TestResultSetMetaData {

	public static void main(String[] args) {
		 try(Connection con = GetConnection.getConnection();) {
			  String sql = "select id as ID,name as NAME,age as AGE from user";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ResultSet rs =  ps.executeQuery();
			  ResultSetMetaData rsmd =  rs.getMetaData();
		      System.out.println("total column : "+rsmd.getColumnCount()); 
		      for(int i =1; i<=rsmd.getColumnCount(); i++) {
		    	  System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnLabel(i)+"  "+rsmd.getColumnDisplaySize(i)+" "+rsmd.getColumnTypeName(i));
		      }
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		  
	}

}
