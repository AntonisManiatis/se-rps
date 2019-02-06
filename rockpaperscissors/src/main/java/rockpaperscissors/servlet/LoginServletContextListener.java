package rockpaperscissors.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import rockpaperscissors.db.FakeAccountRepository;
import rockpaperscissors.db.InMemoryPlayerRepository;

@WebListener
public class LoginServletContextListener implements ServletContextListener
{
    public void contextInitialized(ServletContextEvent sce)
    {
        ServletContext context = sce.getServletContext();
        context.addServlet("loginServlet", new LoginServlet(new FakeAccountRepository(),
        		new InMemoryPlayerRepository())).addMapping("/rockpaperscissors/login");
        
        context.addServlet("profileServlet", new ProfileServlet()).addMapping("/rockpaperscissors/profile");
    }

    public void contextDestroyed(ServletContextEvent sce)
    {
    	
    }
}
