package com.descriptor.tag.demo;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterHanldingMapping implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
		System.out.println("Post Filter");
		arg1.getWriter().print("<html>Post Filter<br/>");
		arg2.doFilter(arg0, arg1);
		
		System.out.println("Pre Filter");
		arg1.getWriter().print("<br/>Pre Filter");
		arg1.getWriter().print("<br/><br/><a href='index.jsp'>Back</a></html>");
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	

}
