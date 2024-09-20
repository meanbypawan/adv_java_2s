package p1;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class TestInsert {
  public static void main(String args[]) {
	  Connection con = null;
	  try {
		  con = GetConnection.getConnection();
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter name");
		  String name = sc.next();
		  
		  System.out.println("Enter contact");
		  String contact = sc.next();
		  
		  System.out.println("Enter Age");
		  int age = sc.nextInt();
	      
		  String sql = "insert into user(name,contact,age) values('"+name+"','"+contact+"',"+age+")";
	      
		  Statement st = con.createStatement();
	       int x  = st.executeUpdate(sql);
	      if(x!=0)
	    	  System.out.println("Record Inserted...");
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
