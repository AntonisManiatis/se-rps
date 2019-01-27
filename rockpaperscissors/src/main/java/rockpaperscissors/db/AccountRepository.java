package rockpaperscissors.db;

import java.util.Collection;

import rockpaperscissors.model.Account;
import rockpaperscissors.model.Credentials;

public interface AccountRepository
{
	Collection<Account> getAll();
	
	Account findAccount(Credentials credentials);
}
