package nl.programit.people.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import nl.programit.people.domain.Person;

public interface PersonRepository extends CrudRepository {
	Person findByFirstName(String firstName);
}
