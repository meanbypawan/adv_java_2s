package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;
import service.GetConnection;

public class UserDAO {
  public static User authenticateUser(User user) {
	  User u = null;
	  try (Connection con = GetConnection.getConnection();){
		  String sql = "select * from user where email = ? and password = ?";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setString(1, user.getEmail());
		  ps.setString(2, user.getPassword());
		  ResultSet rs =  ps.executeQuery();
		  if(rs.next()) {
			  int id = rs.getInt(1);
			  String username  = rs.getString(2);
			  String email = rs.getString(3);
			  String contact = rs.getString(5);
			  u = new User();
			  u.setId(id);
			  u.setUsername(username);
			  u.setEmail(email);
			  u.setContact(contact);		  
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return u;
  }
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
