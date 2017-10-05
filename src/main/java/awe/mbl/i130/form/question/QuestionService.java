package awe.mbl.i130.form.question;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	public List<Question> getAllQuestions(String formId /* , String questionTypeId, String sectionId */) {
		List<Question> questions = new ArrayList<>();
		questionRepository.findByFormId(formId)
				.forEach(questions::add);
//		questionRepository.findByQuestionTypeId(questionTypeId)
//				.forEach(questions::add);
//		questionRepository.findBySectionId(sectionId)
//				.forEach(questions::add);
		return questions;
	}
	
	public Question getQuestion(String id) {
		return questionRepository.findOne(id);
	}
	
	public Question addQuestion(Question question) {
		questionRepository.save(question);
		return question;
	}
	
	public Question updateQuestion(Question question) {
		questionRepository.save(question);
		return question;
	}
	
	public void deleteQuestion(String id) {
		questionRepository.delete(id);
	}

}
