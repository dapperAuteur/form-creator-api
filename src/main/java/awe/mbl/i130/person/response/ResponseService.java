package awe.mbl.i130.person.response;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {
	
	@Autowired
	private ResponseRepository responseRepository;
	
	public List<Response> getAllResponses(String personId) {
		List<Response> responses = new ArrayList<>();
		responseRepository.findByPersonId(personId)
				.forEach(responses::add);
		return responses;
	}
	
	public Response getResponse(String id) {
		return responseRepository.findOne(id);
	}
	
	public Response addResponse(Response response) {
		responseRepository.save(response);
		return response;
	}
	
	public Response updateResponse(Response response) {
		responseRepository.save(response);
		return response;
	}
	
	public void deleteResponse(String id) {
		responseRepository.delete(id);
	}

}
