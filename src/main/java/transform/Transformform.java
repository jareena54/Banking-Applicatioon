package transform;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import newacctount.Userbean;
@WebServlet("/transfer")
public class Transformform extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s = request.getParameter("");
		
		Userbean u=new Userbean();
		u.setAccountnum(Integer.parseInt(s));
		request.setAttribute("bean", u);
		
		int r = TransforDAO.transfromamount(request);
		PrintWriter w = response.getWriter();
		if(r>1) {
			
			RequestDispatcher re = request.getRequestDispatcher("transfer.jsp");
			re.forward(request, response);
			
		}
		else {
			w.print("not");
		}
		
	}
}
