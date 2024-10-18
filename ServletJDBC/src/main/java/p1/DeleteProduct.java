package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import dao.ProductDAO;

public class DeleteProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   PrintWriter out = response.getWriter();
	   String productId = request.getParameter("id"); 
	   if(ProductDAO.removeProduct(Integer.parseInt(productId),getServletContext()))
		   response.sendRedirect("./ViewProduct");
	   else
		   out.print("Something Wrong...");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
