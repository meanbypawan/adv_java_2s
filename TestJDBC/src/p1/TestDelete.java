package p1;

import dao.UserDAO;

public class TestDelete {
  public static void main(String args[]) {
	  if(UserDAO.delete(44))
		  System.out.println("Deleted...");
	  else
		  System.out.println("Not deleted...");
  }
}
