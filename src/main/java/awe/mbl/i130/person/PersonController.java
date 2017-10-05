package awe.mbl.i130.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/persons")
	public List<Person> getAllPersons() {
		return personService.getAllPersons();
	}
	
	@RequestMapping("/persons/{id}")
	public Person getPerson(@PathVariable String id) {
		return personService.getPerson(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/persons")
	public Person addPerson(@RequestBody Person person) {
		return personService.addPerson(person);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/persons/{id}")
	public Person addPerson(@RequestBody Person person, @PathVariable String id) {
		personService.updatePerson(id, person);
		return person;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/persons/{id}")
	public void deletePerson(@PathVariable String id) {
		personService.deletePerson(id);
	}
	
}
