package com.shopNest1.customer1;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopNest1.dbHandler.DataInjector;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		String uname=req.getParameter("uname");
		String mail=req.getParameter("mail");
		String pass=req.getParameter("pass");
		String gender=req.getParameter("gender");
		String address=req.getParameter("address");
		
		String status = DataInjector.addCustomer(uname,mail,pass,gender,address);
		
		resp.sendRedirect("login.jsp");
	}

}
