package p1;

import java.sql.Connection;
import java.util.Scanner;

import dao.UserDAO;
import model.User;

public class TestSaveUser {
   public static void main(String arg[]) {
	 try { 
	   Scanner sc = new Scanner(System.in);
       System.out.println("Enter name");
	   String name = sc.next();
	   
	   System.out.println("Enter Contact");
	   String contact = sc.next();
	   
	   System.out.println("Enter Age");
	   String age = sc.next();
	   
	   User user = new User(name, contact, Integer.parseInt(age));
	   
	   if(UserDAO.save(user))
		   System.out.println("Record Saved....");
	   else
		   System.out.println("Record not saved....");
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
   }
}











