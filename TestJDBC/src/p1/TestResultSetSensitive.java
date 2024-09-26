package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestResultSetSensitive {
  public static void main(String args[]) {
	  try(Connection con = GetConnection.getConnection();) {
		  String sql = "select * from user";
		  PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		  ResultSet rs =  ps.executeQuery();
		  while(rs.next()) {
			int id = rs.getInt(1);
			if(id == 3) {
				rs.updateInt("age", 32);
				rs.updateRow();
			}
		    System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getInt("age"));
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  
  }
}
