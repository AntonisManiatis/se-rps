package rockpaperscissors.db;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class DatabaseBinder extends AbstractBinder
{
	@Override
	protected void configure()
	{
		bind(FakeAccountRepository.class).to(AccountRepository.class);
		bind(new InMemoryPlayerRepository()).to(PlayerRepository.class);
	}
}
