package Deposit;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import newacctount.Userbean;

import java.io.IOException;

@WebServlet("/Depositform")
public class DepositFrom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Userbean u = depositDao.getdepositamo(request);
		request.setAttribute("bean", u);
		RequestDispatcher re = request.getRequestDispatcher("deposit.jsp");
		re.forward(request, response);
		
		
	}

}
