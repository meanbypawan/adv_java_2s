package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Product;

import java.io.IOException;
import java.io.PrintWriter;

import dao.ProductDAO;

public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddProductServlet() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String title = request.getParameter("title");
	   String price = request.getParameter("price");
	   String brand = request.getParameter("brand");
	   
	   Product p = new Product(title, Float.parseFloat(price), brand);
	   PrintWriter out = response.getWriter();
	   if(ProductDAO.save(p))
		   out.print("Product saved..");
	   else
		   out.print("Something wrong....");
	}

}
