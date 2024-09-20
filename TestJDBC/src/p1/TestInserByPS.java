package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestInserByPS {
    public static void main(String args[]) {
    	Connection con = null;
    	try {
    		con = GetConnection.getConnection();
    		Scanner sc = new Scanner(System.in);
    		
    		System.out.println("enter name");
    		String name = sc.next();
    		
    		System.out.println("enter contact");
    		String contact = sc.next();
    		
    		System.out.println("enter Age");
    		String age = sc.next();
    		//                                                      1, 2, 3
    		String sql = "insert into user(name,contact,age) values(?,?,?)";
    		PreparedStatement ps = con.prepareStatement(sql);
    		ps.setString(1,name);
    		ps.setString(2, contact);
    		ps.setInt(3, Integer.parseInt(age));
    		if(ps.executeUpdate()!=0)
    			System.out.println("Record Inserted....");
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
}
