package Withdrawform;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import newacctount.Userbean;

import java.io.IOException;

import Deposit.depositDao;

@WebServlet("/withdrawform")
public class Withdraw extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Userbean u = WithdrawDAO.getwithdraw(request);
		request.setAttribute("bean", u);
		RequestDispatcher re = request.getRequestDispatcher("withdraw.jsp");
		re.forward(request, response);
		
	}

}
