package nl.programit.people.config;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
		
	public JerseyConfig(){
		register(PersonEndpoint.class);
	}

}
