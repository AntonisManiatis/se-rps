package rockpaperscissors.db;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import rockpaperscissors.model.Player;

/**
 * An in memory implementation of {@link PlayerRepository} for testing purposes.
 * @author AnthonyManiatis
 */
public class InMemoryPlayerRepository implements PlayerRepository
{

	@Override
	public void addOnlinePlayer(int playerId)
	{
		
	}

	@Override
	public void removeOnlinePlayer(int playerId)
	{
		
	}

	@Override
	public Collection<Player> getOnlinePlayers()
	{
		List<Player> onlinePlayers = new ArrayList<>();
		Player player = new Player();
		player.setId(1);
		player.setName("John");
		onlinePlayers.add(player);
		
		player = new Player();
		player.setId(2);
		player.setName("George");	
		onlinePlayers.add(player);
		
		player = new Player();
		player.setId(3);
		player.setName("Apostolis");	
		onlinePlayers.add(player);
		return onlinePlayers;
	}
}
