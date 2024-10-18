package p1;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Product;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import dao.ProductDAO;

public class ViewProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ViewProduct() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter out = response.getWriter();
	  ArrayList<Product>al =  ProductDAO.getProductList(getServletContext());
	  out.print("<html>");
	  out.print("<body>");
	  ServletConfig config =  getServletConfig();
	  ServletContext contex =  config.getServletContext();
	  String s = config.getInitParameter("message");
	  String statusCode = config.getInitParameter("statusCode");
	  out.print("<h1>"+s+" "+statusCode+" "+contex.getInitParameter("GlobalMessage")+"</h1>");
	  out.print("<a href='home.html'>Go To Home</a>");
	  out.print("<table border='1' width='100%'>");
	  out.print("<tr>");
	  out.print("<td>Id</td>");
	  out.print("<td>Title</td>");
	  out.print("<td>Price</td>");
	  out.print("<td>Brand</td>");
	  out.print("<td>Delete</td>");
	  out.print("</tr>");
	  for(Product p: al) {
		  out.print("<tr>");
		  out.print("<td>"+p.getId()+"</td>");
		  out.print("<td>"+p.getTitle()+"</td>");
		  out.print("<td>"+p.getPrice()+"</td>");
		  out.print("<td>"+p.getBrand()+"</td>");
		  out.print("<td><a href='./DeleteProduct?id="+p.getId()+"'><button>Delete</button></a></td>");
		  out.print("</tr>");   
	  }
	  out.print("</table>");
	  out.print("</body>");
	  out.print("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
