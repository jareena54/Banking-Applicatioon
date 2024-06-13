package newacctount;

import java.io.Serializable;

public class Userbean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
	private int pword;
	
	private int amount;
	private String Adress;
	private int pnumber;
	private long accountnum;
	
	
	public Userbean() {
		super();
	}
	public Userbean(String username, int pword, int amount, String adress, int pnumber, long accountnum) {
		super();
		this.username = username;
		this.pword = pword;
		this.amount = amount;
		Adress = adress;
		this.pnumber = pnumber;
		this.accountnum = accountnum;
	}
	public long getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(long accountnum) {
		this.accountnum = accountnum;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPword() {
		return pword;
	}
	public void setPword(int pword) {
		this.pword = pword;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public int getPnumber() {
		return pnumber;
	}
	public void setPnumber(int pnumber) {
		this.pnumber = pnumber;
	}
	@Override
	public String toString() {
		return "Userbean [username=" + username + ", pword=" + pword + ", amount=" + amount + ", Adress=" + Adress
				+ ", pnumber=" + pnumber + ", accountnum=" + accountnum + "]";
	}
	
	

}
