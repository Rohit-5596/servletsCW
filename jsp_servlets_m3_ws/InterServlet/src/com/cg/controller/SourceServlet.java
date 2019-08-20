package com.cg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SourceServlet
 */
@WebServlet("/SourceServlet")
public class SourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SourceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("uName");
		String password=request.getParameter("pwd");
		/*ServletContext context=this.getServletContext();
		context.setAttribute("user", username);
		context.setAttribute("passwd", password);
		RequestDispatcher dispatch=context.getRequestDispatcher("/DestinationServlet");// '/'added othewise illegal state exc
		dispatch.forward(request, response);*/
		
		request.setAttribute("user", username);
		request.setAttribute("passwd", password);//getting from html and storing in request object
		
		/*RequestDispatcher dispatch=request.getRequestDispatcher("DestinationServlet");
		dispatch.forward(request, response);*/
		response.sendRedirect("DestinationServlet");
		
	}

}
