package rockpaperscissors.db;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A fake implementation of {@link AccountRepository} for testing purposes.
 * @author AnthonyManiatis
 */
public class FakeAccountRepository implements AccountRepository
{
	public Collection<Account> getAll()
	{
		final List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account(1, "John"));
		accounts.add(new Account(2, "Jimmy"));
		return accounts;
	}
	
	public Account findAccount(Credentials credentials)
	{
		return new Account(3, credentials.getEmail());
	}
}
