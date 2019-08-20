package com.cg.controller;

import java.io.IOException;

import javax.servlet.annotation.*;

import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DEmoServlet
 */
@WebServlet(name="Demo",urlPatterns={"/DEmoServlet","/Demo"},initParams=@WebInitParam(name="email",value="abc@gmail.com"))
public class DEmoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DEmoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ServletConfig config=this.getServletConfig();
		String emailVal=config.getInitParameter("email");
		ServletContext context=this.getServletContext();
		String email=context.getInitParameter("mailId");
		String qStr=request.getParameter("action");
		out.println("from doGet email = "+emailVal+"mail = "+email+" qStr= "+qStr);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("from doPost");
	}

}
