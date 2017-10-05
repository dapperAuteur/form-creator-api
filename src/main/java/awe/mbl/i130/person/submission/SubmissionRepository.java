package awe.mbl.i130.person.submission;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SubmissionRepository extends CrudRepository<Submission, String> {
	
	public List<Submission> findByPersonId(String personId);
	
	public List<Submission> findByFormId(String formId);

}
