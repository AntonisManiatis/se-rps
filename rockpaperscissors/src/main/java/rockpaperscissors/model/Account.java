package rockpaperscissors.model;

public class Account
{
	private int accountId;
	private String email;
	private String username;
	
	public Account() {}
	
	public Account(int accountId, String email, String username)
	{
		this.accountId = accountId;
		this.email = email;
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
	
	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
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
