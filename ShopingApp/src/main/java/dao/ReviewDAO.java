package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Review;
import service.GetConnection;

public class ReviewDAO {
  public static boolean save(Review review) {
	  boolean status = false;
	  Connection con = GetConnection.getConnection();
	  try{
		  String sql = "insert into review(rating,comment,date,reviewerName,reviewerEmail,productId) values(?,?,?,?,?,?)";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setInt(1, review.getRating());
		  ps.setString(2, review.getComment());
		  ps.setString(3, review.getDate());
		  ps.setString(4, review.getReviewerName());
		  ps.setString(5, review.getReviewerEmail());
		  ps.setInt(6, review.getProductId());
		  if(ps.executeUpdate()!=0)
			  status = true;
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return status;
  }
}
