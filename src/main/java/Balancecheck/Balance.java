package Balancecheck;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import newacctount.Userbean;

import java.io.IOException;
import java.util.List;
@WebServlet("/balanceform")

public class Balance extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Userbean> ch = BalancecheckDAO.checkbalacne(request);
		request.setAttribute("checkbean", ch);
		RequestDispatcher re = request.getRequestDispatcher("balance.jsp");
		re.forward(request, response);
		
	}
}
