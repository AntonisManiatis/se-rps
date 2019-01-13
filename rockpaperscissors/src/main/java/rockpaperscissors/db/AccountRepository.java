package rockpaperscissors.db;

import java.util.Collection;

public interface AccountRepository
{
	Collection<Account> getAll();
	
	Account findAccount(Credentials credentials);
}
