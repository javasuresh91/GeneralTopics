package com.descriptor.tag.demo;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigInitParam
 */
public class ServletConfigInitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig servletConfig ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfigInitParam() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.servletConfig = getServletConfig();
		String servletInitValue = servletConfig.getInitParameter("hello");
		System.out.println(servletInitValue);
		
		response.getWriter().print("<html>"
				+ "<table>"
				+ "<tr><td>Servlet Init Vaue : </td><td>"+servletInitValue+"</td><td></td></tr>"
				+ "<tr><tr><td colspan=2><a href='index.jsp'>Back</a></td><td></td></tr></tr>"
				+ "</table>"
				+ "</html>");
		
	}

}
