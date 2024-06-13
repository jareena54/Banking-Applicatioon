package newacctount;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NewAccountDAO {
	static Connection con = Getconnection.getcon();

	public static int newaccount(Userbean u) {
		int ex = 0;
		try {
			PreparedStatement s = con.prepareStatement("insert into newaccount values(?,?,?,?,?,?)");
			s.setString(1, u.getUsername());
			s.setInt(2, u.getPword());
			s.setInt(3, u.getAmount());
			s.setInt(4, u.getPnumber());
			s.setInt(5,u.getPnumber() );
			s.setLong(6, generateaccountnum());
		ex=s.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ex;
	}

	public static long generateaccountnum() {
		Random r = new Random();
		long l = 1000000000L + r.nextInt(900000000);
		return l;

	}

}
