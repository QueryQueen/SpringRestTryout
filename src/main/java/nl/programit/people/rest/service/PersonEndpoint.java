package nl.programit.people.rest.service;

import javax.ws.rs.GET;

import nl.programit.people.domain.Person;

@Path("/people")
@Component

public class PersonEndpoint {
	
	@Autowired
	private PersonService personService;
	
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Response list(){
		
		Iterable<Person> result = this.personService.findAll();
		
		return Response.ok(result).build();
	}
}
