package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.Employee_info;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;


@WebServlet("/changepassword")
public class ChangePasswordServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session!=null) {
			String pass = req.getParameter("password");
			String confirmpass = req.getParameter("confirmpassword");
			
			if(pass.equals(confirmpass))
			{
				Employee_info info = (Employee_info)session.getAttribute("info");
			EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
			dao.changePassword(info.getId(), pass);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
					dispatcher.forward(req, resp);
			}
			else {
				String msg= "Password not matching";
				req.setAttribute("msg", msg);
				
			RequestDispatcher dispatcher =req.getRequestDispatcher("/changepassword.jsp");
			dispatcher.forward(req, resp);
		}}
		else {
			RequestDispatcher dispatcher =req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);	
		}
	}

}
