package awe.mbl.i130.form.question;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, String>{
	
	public List<Question> findByQuestionTypeId(String questionTypeId);
	
	public List<Question> findByFormId(String formId);
	
	public List<Question> findBySectionId(String sectionId);

}
