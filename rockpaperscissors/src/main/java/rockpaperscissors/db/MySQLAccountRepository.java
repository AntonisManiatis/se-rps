package rockpaperscissors.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;

import javax.sql.DataSource;

public class MySQLAccountRepository implements AccountRepository
{
	private final DataSource dataSource;
	
	public MySQLAccountRepository(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
	public Collection<Account> getAll()
	{
		try (Connection connection = dataSource.getConnection())
		{
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Account findAccount(Credentials credentials)
	{
		try (Connection connection = dataSource.getConnection())
		{
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
}
