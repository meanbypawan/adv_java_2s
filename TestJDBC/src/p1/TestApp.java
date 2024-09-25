package p1;

import java.util.ArrayList;
import java.util.Scanner;

import dao.UserDAO;
import model.User;

public class TestApp {
  public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
	  do {
	    System.out.println("Press 1 for insertion");
	    System.out.println("Press 2 for updation");
	    System.out.println("Press 3 for deletion");
	    System.out.println("Press 4 for selection");
	    System.out.println("Press 5 for Exit");
	    System.out.println("Enter your choice");
	    int choice = sc.nextInt();
	    if(choice == 1) {
		  System.out.println("Enter name");
		  String name = sc.next();
		  
		  System.out.println("Enter contact");
		  String contact = sc.next();
		  
		  System.out.println("Enter age");
		  int age = sc.nextInt();
		  
		  User user = new User(name, contact, age);
		  if(UserDAO.save(user))
			  System.out.println("Record saved..");
	  }
	  else if(choice == 2) {
		  System.out.println("Enter name");
		  String name = sc.next();
		  
		  System.out.println("Enter contact");
		  String contact = sc.next();
		  
		  System.out.println("Enter age");
		  int age = sc.nextInt();
		  
		  System.out.println("Enter record id");
		  int id = sc.nextInt();
		  
		  User user = new User(id, name, contact, age);
		  if(UserDAO.update(user))
			  System.out.println("Record updated...");
		  else
			  System.out.println("Record not updated...");
	  }
	  else if(choice == 3) {
		  System.out.println("Enter user id");
		  int id = sc.nextInt();
		  if(UserDAO.delete(id))
			  System.out.println("Record removed...");
		  else
			  System.out.println("Record not found...");
	  }
	  else if(choice == 4) {
		  ArrayList<User> al =  UserDAO.getUserList();
	      for( User u : al)
	    	  System.out.println(u.getId()+"  "+u.getName()+"  "+u.getContact()+"  "+u.getAge());
	 }
    else if(choice == 5)
		  System.exit(0);
	}while(true);    
  }
}
