package rockpaperscissors.db;

public class Account
{
	private int accountId;
	private String username;
	
	public Account() {}
	
	public Account(int accountId, String username)
	{
		this.accountId = accountId;
		this.username = username;
	}
	
	public int getAccountId()
	{
		return accountId;
	}
	
	public void setAccountId(int accountId)
	{
		this.accountId = accountId;
	}
	
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
}
