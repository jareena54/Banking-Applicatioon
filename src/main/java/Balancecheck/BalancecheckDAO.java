package Balancecheck;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import newacctount.Getconnection;
import newacctount.Userbean;

public class BalancecheckDAO {
	static Connection con = Getconnection.getcon();

	public static List<Userbean> checkbalacne(HttpServletRequest request) {
		Userbean u = new Userbean();
		String s = request.getParameter("accno");
		String s1 = request.getParameter("username");
		String s2 = request.getParameter("password");
		List<Userbean>l=new ArrayList<>();
		try {
			PreparedStatement ps = con
					.prepareStatement("select*from newaccount where ACCNO=? and UNAME=? and PWORD=? ");
			ps.setInt(1, Integer.parseInt(s));
			ps.setString(2, s1);
			ps.setInt(3, Integer.parseInt(s2));
			ResultSet re = ps.executeQuery();
			
			
			while (re.next()) {
				l.add(new Userbean(re.getString(1),re.getInt(2),re.getInt(3),re.getString(4),re.getInt(5),re.getLong(6)));
				
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}

}
