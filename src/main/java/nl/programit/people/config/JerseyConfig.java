package nl.programit.people.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import nl.programit.people.rest.service.PersonEndpoint;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
		
	public JerseyConfig(){
		register(PersonEndpoint.class);
	}

}
