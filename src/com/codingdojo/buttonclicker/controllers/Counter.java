package com.codingdojo.buttonclicker.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Counter")
public class Counter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int count;
		if (session.getAttribute("count") == null) {
			count = 0;
			session.setAttribute("count", count);
		} else {
			count = (int) session.getAttribute("count");
		}
		request.setAttribute("count", count);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/counter.jsp");
		view.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int count = (int) session.getAttribute("count");
		count++;
		session.setAttribute("count", count);
		request.setAttribute("count", count);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/counter.jsp");
		view.forward(request, response);
	}

}
