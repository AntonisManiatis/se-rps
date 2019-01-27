package rockpaperscissors.db;

import java.util.Collection;

import rockpaperscissors.model.Player;

/**
 * 
 * @author AnthonyManiatis
 */
public interface PlayerRepository
{
	/**
	 *
	 */
	void addOnlinePlayer(int playerId);
	
	/**
	 * 
	 */
	void removeOnlinePlayer(int playerId);
	
	/**
	 * 
	 * @return a {@link Collection} of all the online players
	 */
	Collection<Player> getOnlinePlayers();
}
