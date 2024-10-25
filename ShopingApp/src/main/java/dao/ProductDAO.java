package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.StringJoiner;

import model.Product;
import model.Review;
import service.GetConnection;

public class ProductDAO {
  public static Product getProduct(int id) {
	  Product p = null;
	  try(Connection con = GetConnection.getConnection();){
		  String sql = "select * from product where id = ?";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setInt(1, id);
		  ResultSet rs = ps.executeQuery();
		  if(rs.next()) {
			     id = rs.getInt(1);
				 String title = rs.getString(2);
				 String description = rs.getString(3);
				 String category = rs.getString(4);
				 float price = rs.getFloat("price");
				 float discountPercentage = rs.getFloat("discountPercentage");
				 float rating = rs.getFloat("rating");
				 int stock = rs.getInt("stock");
				 String brand = rs.getString("brand");
				 String warrantyInformation = rs.getString("warrantyInformation");
				 String shippingInformation = rs.getString("shippingInformation");
				 String availabilityStatus = rs.getString("availabilityStatus");
				 String images = rs.getString("images");
				 String thumbnail = rs.getString("thumbnail");
				 String arr[] = images.split(",");
			     ArrayList<String> imageList = new ArrayList<String>();
				 for(String s : arr)
					imageList.add(s);
				 p = new Product();
				 p.setId(id);
				 p.setTitle(title);
				 p.setDescription(description);
				 p.setCategory(category);
				 p.setPrice(price);
				 p.setDiscountPercentage(discountPercentage);
				 p.setRating(rating);
				 p.setStock(stock);
				 p.setBrand(brand);
				 p.setWarrantyInformation(warrantyInformation);
				 p.setShippingInformation(shippingInformation);
				 p.setAvailabilityStatus(availabilityStatus);
				 p.setImages(imageList);
				 p.setThumbnail(thumbnail);
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return p;
  }
  public static ArrayList<Product> getProductList(){
	  ArrayList<Product> al = new ArrayList<Product>();
	  try (Connection con = GetConnection.getConnection();){
		 String sql = "select * from product";
		 PreparedStatement ps = con.prepareStatement(sql);
		 ResultSet rs = ps.executeQuery();
		 while(rs.next()) {
			 int id = rs.getInt(1);
			 String title = rs.getString(2);
			 String description = rs.getString(3);
			 String category = rs.getString(4);
			 float price = rs.getFloat("price");
			 float discountPercentage = rs.getFloat("discountPercentage");
			 float rating = rs.getFloat("rating");
			 int stock = rs.getInt("stock");
			 String brand = rs.getString("brand");
			 String warrantyInformation = rs.getString("warrantyInformation");
			 String shippingInformation = rs.getString("shippingInformation");
			 String availabilityStatus = rs.getString("availabilityStatus");
			 String images = rs.getString("images");
			 String thumbnail = rs.getString("thumbnail");
			 String arr[] = images.split(",");
		     ArrayList<String> imageList = new ArrayList<String>();
			 for(String s : arr)
				imageList.add(s);
			 Product p = new Product();
			 p.setId(id);
			 p.setTitle(title);
			 p.setDescription(description);
			 p.setCategory(category);
			 p.setPrice(price);
			 p.setDiscountPercentage(discountPercentage);
			 p.setRating(rating);
			 p.setStock(stock);
			 p.setBrand(brand);
			 p.setWarrantyInformation(warrantyInformation);
			 p.setShippingInformation(shippingInformation);
			 p.setAvailabilityStatus(availabilityStatus);
			 p.setImages(imageList);
			 p.setThumbnail(thumbnail);
			 al.add(p);
		 }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return al;
  }
  public static boolean saveInBulk(ArrayList<Product> list) {
	  boolean status = false;
	  try (Connection con = GetConnection.getConnection();){
		  con.setAutoCommit(false);
		  String sql = "insert into product(id,title,description,category,price,discountPercentage,rating,stock,brand,warrantyInformation,shippingInformation,availabilityStatus,images,thumbnail) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		  PreparedStatement ps = con.prepareStatement(sql);
		  String sql2 = "insert into review(rating,comment,date,reviewerName,reviewerEmail,productId) values(?,?,?,?,?,?)";
		  PreparedStatement ps2 = con.prepareStatement(sql2);
		  for(Product p : list) {
			  ps.setInt(1, p.getId());
			  ps.setString(2, p.getTitle());
			  ps.setString(3, p.getDescription());
			  ps.setString(4, p.getCategory());
			  ps.setFloat(5, p.getPrice());
			  ps.setFloat(6,p.getDiscountPercentage());
			  ps.setFloat(7, p.getRating());
			  ps.setInt(8, p.getStock());
			  ps.setString(9, p.getBrand());
			  ps.setString(10, p.getWarrantyInformation());
			  ps.setString(11,p.getShippingInformation());
			  ps.setString(12, p.getAvailabilityStatus());
			  String images = "";
			  StringJoiner sj = new StringJoiner(",");
			  for(String imageUrl : p.getImages()) {
				  sj.add(imageUrl);
			  }
			  images = sj.toString();
			  ps.setString(13, images);
			  ps.setString(14,p.getThumbnail());
			  
			  int x = ps.executeUpdate();
		      if(x==0) {
		    	break;  
		      }
		      
			  ArrayList<Review> reviewList =  p.getReviews();
		      for(Review obj : reviewList) {
		      	  ps2.setInt(1, obj.getRating());
				  ps2.setString(2, obj.getComment());
				  ps2.setString(3, obj.getDate());
				  ps2.setString(4, obj.getReviewerName());
				  ps2.setString(5, obj.getReviewerEmail());
				  ps2.setInt(6, p.getId());
		    	  if(ps2.executeUpdate()!=0)
		    		  continue;
		    	  else {
		    		  con.rollback();
		    		  return  false;
		    	  }
		      }
		      
		  }
		  status = true;
		  con.commit();
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return status;
  }
}
