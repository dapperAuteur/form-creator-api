package awe.mbl.i130.person.response;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ResponseRepository extends CrudRepository<Response, String>{
	
	public List<Response> findByPersonId(String personId);
	
	public List<Response> findByQuestionId(String questionId);
	
	public List<Response> findBySubmissionId(String submissionId);

}
