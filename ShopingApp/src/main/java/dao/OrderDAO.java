package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.OrderDetails;
import service.GetConnection;

public class OrderDAO {
   public static boolean save(OrderDetails order) {
	   boolean status = false;
	   try(Connection con = GetConnection.getConnection();){
		   String sql = "insert into orderDetails(name,contact,deliveryAddress,productId,userId,billAmount) values(?,?,?,?,?,?)";
		   PreparedStatement ps = con.prepareStatement(sql);
		   ps.setString(1,order.getName());
		   ps.setString(2, order.getContact());
		   ps.setString(3,order.getDeliveryAddress());
		   ps.setInt(4, order.getProductId());
		   ps.setInt(5, order.getUserId());
		   ps.setFloat(6, order.getBillAmount());
		   if(ps.executeUpdate()!=0)
			   status = true;
		   
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return status;
   }
}
