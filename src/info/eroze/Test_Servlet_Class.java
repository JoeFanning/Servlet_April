package info.eroze;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class April_24_Servlet
 */
@WebServlet(urlPatterns={"/Test_Servlet_Class"})
public class Test_Servlet_Class implements Servlet {
	
	/* String used for init method created by you */
     String initInfo;
     
    /**
     * Default constructor. 
     */
    public Test_Servlet_Class() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
     initInfo ="inside init method";
     System.out.println(initInfo);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		
		return null; 
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		java.util.Date date = new java.util.Date();
		String name = request.getParameter("user_Name");
		String email= request.getParameter("email");
		Object fly_jpg= request.getParameter("fly");
		String ip = request.getRemoteAddr();
		 
		String html="<html><body><h2>"
				+"Date: "+date
				+"<br>name: "+name
				+"<br>email: "+email
				+"<br>Remote ip address: "+ip
				+"<br>init: "+initInfo
				+"<br>get Servlet info:  "+getServletInfo()
				+"<br>get Servlet Config: "+getServletConfig()
				+"<br>get Servlet Config: "+getServletConfig()
				+"</h2>"
				+ "<img id='fly' src='images/fly_drawing.jpg' alt='fly' width='100' height='100'></body>"
				+"</html>";
		
		 response.getWriter().println(html);
		 
	}}