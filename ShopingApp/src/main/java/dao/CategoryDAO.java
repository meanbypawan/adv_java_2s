package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Category;
import service.GetConnection;

public class CategoryDAO {
   public static ArrayList<Category> getCategoryList(){
	   ArrayList<Category> al = new ArrayList<Category>();
	   try(Connection con = GetConnection.getConnection();){
		   String sql = "select * from category";
		   PreparedStatement ps = con.prepareStatement(sql);
		   ResultSet rs = ps.executeQuery();
		   while(rs.next()) {
			   int id = rs.getInt(1);
			   String slug = rs.getString(2);
			   String name = rs.getString(3);
			   String url = rs.getString(4);
			   
			   Category c = new Category(id, slug, name, url);
			   al.add(c);
		   }
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return al;
   }
   public static boolean saveInBulk(ArrayList<Category> list) {
	   boolean status = false;
	   try(Connection con = GetConnection.getConnection();) {
		   con.setAutoCommit(false);
		   String sql = "insert into category(slug,name,url) values(?,?,?)";
		   PreparedStatement ps = con.prepareStatement(sql);
		   for(Category c : list) {
			   ps.setString(1, c.getSlug());
			   ps.setString(2, c.getName());
			   ps.setString(3, c.getUrl());
			   if(ps.executeUpdate() == 0)
				   return false;
		   }
		   con.commit();
		   status = true;
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return status;
   }
}
