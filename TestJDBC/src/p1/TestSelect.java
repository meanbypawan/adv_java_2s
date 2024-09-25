package p1;

import java.util.ArrayList;

import dao.UserDAO;
import model.User;

public class TestSelect {
   public static void main(String args[]) {
	  ArrayList<User> al =  UserDAO.getUserList();
      for( User u : al)
    	  System.out.println(u.getId()+"  "+u.getName()+"  "+u.getContact()+"  "+u.getAge());
   }
}
