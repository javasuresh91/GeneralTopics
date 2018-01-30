package com.descriptor.tag.demo;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextServletDemo
 */
public class ContextServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContextServletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 ServletContext sc = getServletContext();
		 String contextParamValue = sc.getInitParameter("myName");
		 response.getWriter().print("<html><body>"
		 		+ "<table>"
		 		+ "<tr><td>Context Param Value: </td><td>"+contextParamValue+"</td><td>//Value from 'context-param'</td></tr>"
		 		+ "<tr><td>Servlet Context Path: </td><td>"+sc.getContextPath()+"</td><td></td></tr>"
		 		+ "<tr><td>Servlet Context Name: </td><td>"+sc.getServletContextName()+"</td><td>//Value from 'Display-name'</td></tr>"
		 		+ "<tr><td>Server Info: </td><td>"+sc.getServerInfo()+"</td><td></td></tr>"
		 		+ "<tr><tr><td colspan=2><a href='index.jsp'>Back</a></td><td></td></tr></tr>"
		 		+ "</table>"
		 		+ "</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
