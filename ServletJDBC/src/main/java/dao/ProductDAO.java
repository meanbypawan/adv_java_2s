package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jakarta.servlet.ServletContext;
import model.Product;
import service.GetConnection;

public class ProductDAO {
  public static boolean removeProduct(int id,ServletContext context) {
	  boolean status = false;
	  try (Connection con = GetConnection.getConnection(context);){
		  String sql = "delete from product where id = ?";
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
  public static ArrayList<Product> getProductList(ServletContext context){
	  ArrayList<Product> al = new ArrayList<Product>();
	  try (Connection con = GetConnection.getConnection(context);){
		 String sql = "select * from product";
		 PreparedStatement ps = con.prepareStatement(sql);
		 ResultSet rs =  ps.executeQuery();
	     while(rs.next()) {
	    	 int id = rs.getInt(1);
	    	 String title = rs.getString(2);
	    	 float price = rs.getFloat(3);
	    	 String brand = rs.getString(4);
	    	 Product p =new Product(id, title, price, brand);
	    	 al.add(p);
	     }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return al;
  }
  public static boolean save(Product p,ServletContext context) {
	 boolean status = false;
	 try (Connection con = GetConnection.getConnection(context);){
		 String sql = "insert into product(title,price,brand) values(?,?,?)";
		 PreparedStatement ps = con.prepareStatement(sql);
		 ps.setString(1, p.getTitle());
		 ps.setFloat(2, p.getPrice());
		 ps.setString(3, p.getBrand());
		 if(ps.executeUpdate()!=0)
			 status = true;
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
     return status;
  }
}
