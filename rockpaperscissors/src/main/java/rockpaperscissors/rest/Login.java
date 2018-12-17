package rockpaperscissors.rest;

import java.util.Collection;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import rockpaperscissors.db.Account;
import rockpaperscissors.db.AccountRepository;
import rockpaperscissors.model.LoginResult;

/**
 * @author AnthonyManiatis
 */
@Path("/login")
public class Login
{
	private final AccountRepository accountRepo;
	
	@Inject
	public Login(AccountRepository accountRepo)
	{
		this.accountRepo = accountRepo;
	}
	
	@POST
	@Path("/id")
	@Produces(MediaType.APPLICATION_JSON)
	public LoginResult getMsg()
	{
		LoginResult result = new LoginResult();
		result.setId(1);
		result.setDate(45);
		return result;
	}
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Account> getAccounts()
	{
		return accountRepo.getAll();
	}
}
