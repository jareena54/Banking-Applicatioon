package Withdrawform;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.http.HttpServletRequest;
import newacctount.Getconnection;
import newacctount.Userbean;

public class WithdrawDAO {
	static Connection con = Getconnection.getcon();
	public static Userbean getwithdraw(HttpServletRequest req) {
		
		 Userbean u=new Userbean();
		try {
		
		PreparedStatement st = con.prepareStatement("update newaccount set AMOUNT=AMOUNT-? where ACCNO=? and UNAME=? and PWORD=?");
	st.setInt(1, Integer.parseInt(req.getParameter("amount")));
	st.setInt(2, Integer.parseInt(req.getParameter("accountno")));
	st.setString(3, req.getParameter("username"));
	st.setInt(4, Integer.parseInt(req.getParameter("password")));
 
st.executeUpdate();
 PreparedStatement sts = con.prepareStatement("select AMOUNT from newaccount where ACCNO=?");
 sts.setInt(1, Integer.parseInt(req.getParameter("accountno")));
	ResultSet re = sts.executeQuery();
	while(re.next()) {
		u.setAmount(re.getInt(1));
		System.out.println(re.getInt(1));
	}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return u;
		
	}

}
