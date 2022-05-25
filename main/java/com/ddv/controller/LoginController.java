package com.ddv.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ddv.model.UserModel;
import com.ddv.pojo.UserPojo;
import com.mysql.cj.Session;

@WebServlet("/mylogin")
public class LoginController extends HttpServlet {
	
	UserModel userModel = new UserModel();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		req.getRequestDispatcher("login.jsp").forward(req, resp);
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String checkbox = req.getParameter("checkbox");
		UserPojo user = userModel.login(email, password);

		if (user != null) {
			if(checkbox != null) {
				HttpSession session = req.getSession();
				session.setAttribute("email", email);
				session.setAttribute("password", password);
				session.setAttribute("checkbox", checkbox);
				session.setMaxInactiveInterval(1000);
				resp.sendRedirect(req.getContextPath() + "/loginInfo");
			}else {
				HttpSession session = req.getSession();
				session.setAttribute("email", email);
				session.setAttribute("password", password);
				resp.sendRedirect(req.getContextPath() + "/loginInfo");
			}
			
		} else {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
			super.doPost(req, resp);
		}
	}
}
