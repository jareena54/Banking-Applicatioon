package closingAccount;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import newacctount.Userbean;

@WebServlet("/closingform")
public class ClosingAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Userbean u=new Userbean();
	String s = request.getParameter("accountno");
	String s1 = request.getParameter("username");
	String s2 = request.getParameter("pword");
	u.setAccountnum(Integer.parseInt(s));
	u.setUsername(s1);
	u.setPword(Integer.parseInt(s2));
	int c = ClosingDAO.closingform(u);
	if(c>0) {
	request.setAttribute("bean", u);
	RequestDispatcher re = request.getRequestDispatcher("delete.jsp");
	re.forward(request, response);
	}
	else {
		PrintWriter w = response.getWriter();
		w.println("not deleted the account try to delete again");
	}
		
		
		
	}

}
