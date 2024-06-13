package newacctount;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/newaccount")
public class NewAccount extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Userbean u=new Userbean();
		response.setContentType("text/html");
		String p = request.getParameter("username");
		String s1 = request.getParameter("password");
		String s2 = request.getParameter("re-password");
		String s3 = request.getParameter("amount");
		String s4 = request.getParameter("address");
		String s5 = request.getParameter("phone");
	
		u.setUsername(p);
		
		u.setPword(Integer.parseInt(s1));
		
	
		
		u.setAmount(Integer.parseInt(s3));
		u.setAdress(s4);
		u.setPnumber(Integer.parseInt(s5));
		u.setAccountnum(NewAccountDAO.generateaccountnum());
		
		
		if(s1.equals(s2)) {
			request.setAttribute("userbean", u);
			RequestDispatcher re = request.getRequestDispatcher("newaccount.jsp");
			re.forward(request, response);
		}
		else {
			PrintWriter w = response.getWriter();
			w.println("<html>");
			w.println("<h1>");
			w.println("the password mismatched try again");
			RequestDispatcher req = request.getRequestDispatcher("newAccount.html");
			req.include(request, response);
			w.println("</h1>");
			w.println("</body></html>");
		}
		
		
		
	}

}
