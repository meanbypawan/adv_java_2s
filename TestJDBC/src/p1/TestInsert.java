package p1;

import java.sql.Connection;

public class TestInsert {
  public static void main(String args[]) {
	  Connection con = null;
	  try {
		  con = GetConnection.getConnection();
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
