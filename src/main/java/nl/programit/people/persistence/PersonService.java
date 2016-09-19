package nl.programit.people.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
	
	public void save(Person person){
		this.personRepository.save(person;)
	}
}
