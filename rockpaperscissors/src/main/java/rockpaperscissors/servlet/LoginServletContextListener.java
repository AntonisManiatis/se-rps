package rockpaperscissors.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import rockpaperscissors.db.FakeAccountRepository;

@WebListener
public class LoginServletContextListener implements ServletContextListener
{
    @Override
    public void contextInitialized(ServletContextEvent sce)
    {
        ServletContext context = sce.getServletContext();
        context.addServlet("loginServlet", new LoginServlet(new FakeAccountRepository())).addMapping("/rockpaperscissors/login");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce)
    {
    	
    }
}
