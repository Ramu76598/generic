package com.simpli.lean;

import javax.servlet.GenericServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name="GenricServletExample",urlPatterns="/genericDemo")
public class GenericServletExample extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		PrintWriter out=res.getWriter();
		out.append("<html><body>");
		String name=req.getParameter("name");
		out.println("hello"+name);
		out.append("</body></html>");
		
		
		
		
	}
	
	
	

}