package p1;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/*
  Servlet
  GenericServlet
  HttpServlet
  ------------------------
  Servlet LifeCycle
   1. init  -----> Invoke at the time Servlet Instantiation
   2. service ---> At every request of this Servlet
   3. destroy ---> Invoke when web server is shutdown
 */
public class TestServlet implements Servlet{
    @Override
    public void init(ServletConfig arg0) throws ServletException {
      System.out.println("Init called....");
    }
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
       System.out.println("service called....");
    }
    @Override
    public void destroy() {
    	System.out.println("Destroy called......");
    }
    @Override
    public String getServletInfo() {
    	return null;
    }
    @Override
    public ServletConfig getServletConfig() {
    	return null;
    }
}





