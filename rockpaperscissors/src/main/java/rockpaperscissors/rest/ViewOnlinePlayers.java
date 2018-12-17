package rockpaperscissors.rest;

import java.util.Collection;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import rockpaperscissors.db.Player;
import rockpaperscissors.db.PlayerRepository;

@Path("/players")
public class ViewOnlinePlayers
{
	private final PlayerRepository playerRepo;
	
	@Inject
	public ViewOnlinePlayers(PlayerRepository playerRepo)
	{
		this.playerRepo = playerRepo;
	}
	
	@POST
	@Path("/add/{playerId}")
	public void addOnlinePlayer(@PathParam("playerId") int playerId)
	{
		
	}
	
	@DELETE
	@Path("/remove/{playerId}")
	public void removeOnlinePlayer(@PathParam("playerId") int playerId)
	{
		
	}
	
	/**
	 * Gets all the currently online players.
	 * @return a {@link Collection} of all the currently online players.
	 */
	@GET
	@Path("/online")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Player> getOnlinePlayers()
	{
		return playerRepo.getOnlinePlayers();
	}
}
