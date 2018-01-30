package com.descriptor.tag.demo;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterConfigHandlingMapping implements Filter {

	FilterConfig fConfig;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		arg1.getWriter().print("<html> Post Filtering");
		String singleParamValue = fConfig.getInitParameter("paramOne");
		Enumeration<String> paramName = fConfig.getInitParameterNames();
		arg1.getWriter().print("<br/>Servlet Context Value : " +fConfig.getServletContext().getContextPath()+"     //Application Path");
		arg1.getWriter().print("<br/>init Param Value of 'paramOne': " +singleParamValue+"    //Value of the Singla Param in the 'filter' tag");
		arg1.getWriter().print("<br/>List Param Name : " +paramName+"  //List of Param name in the 'filter' tag <br/>");
		arg2.doFilter(arg0, arg1);
		arg1.getWriter().print("<br/>Pre Filtering");
		arg1.getWriter().print("<br/><br/><a href='index.jsp'>Back</a></html>");
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		this.fConfig = arg0;
		
	}
	

}
