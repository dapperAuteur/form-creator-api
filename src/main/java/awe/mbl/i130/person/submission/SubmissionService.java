package awe.mbl.i130.person.submission;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubmissionService {
	
	@Autowired
	private SubmissionRepository submissionRepository;
	
	public List<Submission> getAllSubmissions(String personId) {
		List<Submission> submissions = new ArrayList<>();
		submissionRepository.findByPersonId(personId)
				.forEach(submissions::add);
		return submissions;
	}
	
	public Submission getSubmission(String id) {
		return submissionRepository.findOne(id);
	}
	
	public Submission addSubmission(Submission submission) {
		submissionRepository.save(submission);
		return submission;
	}
	
	public Submission updateSubmission(Submission submission) {
		submissionRepository.save(submission);
		return submission;
	}
	
	public void deleteSubmission(String id) {
		submissionRepository.delete(id);
	}

}
