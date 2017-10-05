package awe.mbl.i130.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
//	private List<Person> persons = new ArrayList<>(Arrays.asList(
//			new Person("1", "fonzarelli@awews.com", "Earl", "E-40", "Stevens"),
//			new Person("2", "facemob@awews.com", "Brad", "Scarface", "Jordan"),
//			new Person("3", "r@awews.com", "Rakim", "God MC", "Allah")
//			));
	@Autowired
	private PersonRepository personRepository;
	
	public List<Person> getAllPersons() {
		List<Person> persons = new ArrayList<>();
		personRepository.findAll()
		.forEach(persons::add);
		return persons;
	}
	
	public Person getPerson(String id) {
//		return persons.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return personRepository.findOne(id);
	}

	public Person addPerson(Person person) {
		// TODO Auto-generated method stub
//		persons.add(person);
		personRepository.save(person);
		return person;
	}

	public Person updatePerson(String id, Person person) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < persons.size(); i++) {
//			Person t = persons.get(i);
//			if (t.getId().equals(id)) {
//				persons.set(i, person);
//				return person;
//			}
//		}
		personRepository.save(person);
		return person;
	}

	public void deletePerson(String id) {
		// TODO Auto-generated method stub
//		persons.removeIf(t -> t.getId().equals(id));
		personRepository.delete(id);
	}

}
