package awe.mbl.i130.person.response;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import awe.mbl.i130.person.Person;

@RestController
public class ResponseController {
	
	@Autowired
	private ResponseService responseService;
	
	@RequestMapping("/persons/{id}/responses")
	public List<Response> getAllResponses(@PathVariable String id) {
		return responseService.getAllResponses(id);
	}
	
	@RequestMapping("/persons/{personId}/responses/{id}")
	public Response getResponse(@PathVariable String id) {
		return responseService.getResponse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/persons/{personId}/responses")
	public Response addResponse(@RequestBody Response response, @PathVariable String personId) {
		response.setPerson(new Person(personId, "", "", "", ""));
		responseService.addResponse(response);
		return response;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/persons/{personId}/responses/{id}")
	public Response updateResponse(@RequestBody Response response, @PathVariable String personId) {
		response.setPerson(new Person(personId, "", "", "", ""));
		responseService.updateResponse(response);
		return response;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/persons/{personId}/responses/{id}")
	public void deleteResponse(@PathVariable String id) {
		responseService.deleteResponse(id);
	}

}
