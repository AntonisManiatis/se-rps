package rockpaperscissors;

import org.glassfish.jersey.server.ResourceConfig;

import rockpaperscissors.db.DatabaseBinder;

public class ApplicationConfig extends ResourceConfig
{
	public ApplicationConfig()
	{
		register(new DatabaseBinder());
		packages("rockpaperscissors");
	}
}
