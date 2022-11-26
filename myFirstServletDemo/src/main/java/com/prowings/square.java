package com.prowings;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class square extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		
//			int k=(int)req.getAttribute("k");
		
			int k=Integer.parseInt(req.getParameter("k"));
			k=k*k;
			PrintWriter out=resp.getWriter();
			out.println("Square is: "+k);
	}
}
