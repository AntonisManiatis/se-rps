package rockpaperscissors.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rockpaperscissors.db.AccountRepository;
import rockpaperscissors.db.PlayerRepository;
import rockpaperscissors.model.Account;
import rockpaperscissors.model.Credentials;

/**
 * 
 * @author AnthonyManiatis
 */
public class LoginServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final AccountRepository accountRepository;
	private final PlayerRepository playerRepository;
	
	public LoginServlet(AccountRepository accountRepository, 
			PlayerRepository playerRepository)
	{
		this.accountRepository = accountRepository;
		this.playerRepository = playerRepository;
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException
	{
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        Credentials credentials = new Credentials(email, pass);
        Account account = accountRepository.findAccount(credentials);
        if (account != null)
        {
        	// Add the user to the online players
        	// playerRepository.addOnlinePlayer(playerId);
        	
        	// Redirect to the main page.
        	resp.sendRedirect("/rockpaperscissors/onlineplayers.html");
        }
        else
        {
        	// Redirect to the home page.
        	// TODO: Also add a message that the password was incorrect
        	resp.sendRedirect("/rockpaperscissors/index.html");
        }
	}
}
