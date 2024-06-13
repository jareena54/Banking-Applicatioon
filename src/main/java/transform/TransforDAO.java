package transform;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.http.HttpServletRequest;
import newacctount.Getconnection;

public class TransforDAO {
	static Connection con = Getconnection.getcon();

	static int x = 0;
	static int y = 0;

	public static int transfromamount(HttpServletRequest req) {

		try {
			con.setAutoCommit(false);
			PreparedStatement st = con.prepareStatement("update newaccount set AMOUNT=AMOUNT-? where ACCNO=?");
			String amount = req.getParameter("amount");
			st.setInt(1, Integer.parseInt(amount));
			String p = req.getParameter("accountnumber");
			st.setInt(2, Integer.parseInt(p));
			x = st.executeUpdate();

			PreparedStatement st1 = con.prepareStatement("update newaccount set AMOUNT=AMOUNT+? where ACCNO=?");
			String am = req.getParameter("amount");
			st1.setInt(1, Integer.parseInt(am));
			String p1 = req.getParameter("accountno2");
			st1.setInt(2, Integer.parseInt(p1));
			y = st1.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x + y;

	}

}
