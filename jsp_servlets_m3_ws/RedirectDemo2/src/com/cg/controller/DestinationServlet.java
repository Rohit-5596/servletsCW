package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DestinationServlet
 */
@WebServlet("/DestinationServlet")
public class DestinationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DestinationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=(String) request.getAttribute("user");
		String password=(String) request.getAttribute("passwd");
		String phone=(String) request.getAttribute("phone");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Welcome you have logged in successfully</h1>");
		out.println("<h2>username is "+username+"</h2>");
		out.println("<h2>your registered phone no is "+phone+"</h2>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=(String) request.getAttribute("user");
		String password=(String) request.getAttribute("passwd");
		String phone=(String) request.getAttribute("phone");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Welcome you have logged in successfully</h1>");
		out.println("<h2>username is "+username+"</h2>");
		out.println("<h2>your registered phone no is "+phone+"</h2>");
		out.println("</body>");
		out.println("</html>");
	
	}

}
