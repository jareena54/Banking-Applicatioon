package closingAccount;

import java.sql.Connection;
import java.sql.PreparedStatement;

import newacctount.Getconnection;
import newacctount.Userbean;

public class ClosingDAO {
	static Connection con = Getconnection.getcon();
	public static int closingform(Userbean u) {
		int e=0;
		try {
		PreparedStatement s = con.prepareStatement("delete from newaccount where ACCNO=? and UNAME=? and pword=?");
		s.setLong(1, u.getAccountnum());
		s.setString(2, u.getUsername());
		s.setInt(3, u.getPword());
		e = s.executeUpdate();
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
		return e;
	}

}
