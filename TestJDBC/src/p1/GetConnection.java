package p1;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
    private static Connection con = null;
    public static Connection getConnection() {
    	try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch630","root","root");
    	 System.out.println("Database Connected....");
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	return con;
    }
}
