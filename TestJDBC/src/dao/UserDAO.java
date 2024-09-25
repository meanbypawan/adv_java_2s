package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.User;
import p1.GetConnection;

public class UserDAO {
   public static ArrayList<User> getUserList() {
	   ArrayList<User> al = new ArrayList<User>();
	   try (Connection con = GetConnection.getConnection();){
		   String sql = "select * from user";
		   //PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_FORWARD_ONLY);
		   //PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE);
		   PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		   ResultSet rs =  ps.executeQuery();
		   while(rs.next()) {
			  //int id = rs.getInt("id");
			  int id = rs.getInt(1);
			  String name = rs.getString("name");
		      String contact = rs.getString("contact");
		      int age = rs.getInt("age");
		      User user = new User(id, name, contact, age);
		      al.add(user);
		   }
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return al;
   }
   public static boolean update(User user) {
	   boolean status = false;
	   try (Connection con = GetConnection.getConnection();){
		   String sql = "update user set name = ?, contact = ?, age = ? where id = ?";
	       PreparedStatement ps = con.prepareStatement(sql);
	       ps.setString(1, user.getName());
	       ps.setString(2, user.getContact());
	       ps.setInt(3, user.getAge());
	       ps.setInt(4, user.getId());
	       if(ps.executeUpdate()!=0)
	    	   status = true;
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return status;
   }
   public static boolean delete(Integer id) {
	   boolean status = false;
	   try(Connection con = GetConnection.getConnection();){
		   String sql = "delete from user where id = ?";
		   PreparedStatement ps = con.prepareStatement(sql);
		   ps.setInt(1, id);
		   if(ps.executeUpdate()!=0)
			   status = true;
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return status;
   }
   public static boolean save(User user) {
	 Connection con = null;
	 boolean status = false;
	 try {
	   con = GetConnection.getConnection();
	   String sql = "insert into user(name,contact,age) values(?,?,?)";
	   PreparedStatement ps = con.prepareStatement(sql);
	   ps.setString(1, user.getName());
	   ps.setString(2, user.getContact());
	   ps.setInt(3, user.getAge());
	   if(ps.executeUpdate()!=0)
		   status =  true;
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 finally {
		 try {
			 con.close();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
     return status;   
   }
}
