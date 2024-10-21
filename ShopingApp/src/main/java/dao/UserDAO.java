package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.User;
import service.GetConnection;

public class UserDAO {
  public static boolean save(User user) {
	  try(Connection con = GetConnection.getConnection();){
		  String sql = "insert into user(username,email,password,contact) values(?,?,?,?)";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setString(1, user.getUsername());
		  ps.setString(2, user.getEmail());
		  ps.setString(3, user.getPassword());
		  ps.setString(4, user.getContact());
		  if(ps.executeUpdate()!=0)
			  return true;
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return false;
  }
}
