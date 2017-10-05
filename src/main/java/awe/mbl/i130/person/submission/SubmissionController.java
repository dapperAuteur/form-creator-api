package awe.mbl.i130.person.submission;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import awe.mbl.i130.person.Person;


@RestController
public class SubmissionController {
	
	@Autowired
	private SubmissionService submissionService;
	
	@RequestMapping("/persons/{id}/submissions")
	public List<Submission> getAllSubmissions(@PathVariable String id) {
		return submissionService.getAllSubmissions(id);
	}
	
	@RequestMapping("/persons/{personId}/submissions/{id}")
	public Submission getSubmission(@PathVariable String id) {
		return submissionService.getSubmission(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/persons/{personId}/submissions")
	public Submission addSubmission(@RequestBody Submission submission, @PathVariable String personId) {
		submission.setPerson(new Person(personId, "", "", "", ""));
		submissionService.addSubmission(submission);
		return submission;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/persons/{personId}/submissions/{id}")
	public Submission updateSubmission(@RequestBody Submission submission, @PathVariable String personId) {
		submission.setPerson(new Person(personId, "", "", "", ""));
		submissionService.updateSubmission(submission);
		return submission;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/persons/{personId}/submissions/{id}")
	public void deleteSubmission(@PathVariable String id) {
		submissionService.deleteSubmission(id);
	}

}
