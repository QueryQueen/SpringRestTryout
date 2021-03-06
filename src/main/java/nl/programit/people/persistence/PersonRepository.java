package nl.programit.people.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import nl.programit.people.domain.Person;

//door component wordt het toegevoegd aan de beans 'encyclopedie'
@Component
public interface PersonRepository extends CrudRepository<Person, Long> {
	Person findByFirstName(String firstName);
}
