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

@WebServlet("/loginInfo")
public class LoginInfoController extends HttpServlet {
	UserModel userModel = new UserModel();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		String email = (String) session.getAttribute("email");
		String password = (String) session.getAttribute("password");
		
		req.setAttribute("email", email);
		req.setAttribute("password", password);
		System.out.println("vao trang login info");
		req.getRequestDispatcher("loginInfo.jsp").forward(req, resp);
		super.doGet(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
