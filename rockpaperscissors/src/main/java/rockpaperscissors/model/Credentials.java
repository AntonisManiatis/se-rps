package rockpaperscissors.model;

public class Credentials
{
	private String email;
	private String password;
	
	public Credentials(String email, String password)
	{
		this.setEmail(email);
		this.setPassword(password);
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		if (email == null || email.isEmpty())
		{
			throw new IllegalArgumentException("Email cannot be null or empty!");
		}
		
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		if (password == null || password.isEmpty())
		{
			throw new IllegalArgumentException("Password cannot be null or empty!");
		}
		
		this.password = password;
	}
}
