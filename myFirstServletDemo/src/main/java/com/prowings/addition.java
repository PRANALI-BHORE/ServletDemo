package com.prowings;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class addition extends HttpServlet {
//	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i + j;
//		
//		PrintWriter out=resp.getWriter();
//		out.println("Result is: " + k);
//	}

	
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));
			int k = i + j;
			//method 1
//			PrintWriter out=resp.getWriter();
//			out.println("Result is: " + k);
			
			//connecting two server add and square
//			k=k*k;
//			req.setAttribute("k",k);
//			RequestDispatcher rd=req.getRequestDispatcher("square");
//			rd.forward(req, resp);
			
			resp.sendRedirect("square?k="+k);
			
		}
}
