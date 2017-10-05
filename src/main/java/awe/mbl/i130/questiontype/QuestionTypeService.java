package awe.mbl.i130.questiontype;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionTypeService {
	
	@Autowired
	private QuestionTypeRepository questionTypeRepository;
	
	public List<QuestionType> getAllQuestionTypes() {
		List<QuestionType> questionTypes = new ArrayList<>();
		questionTypeRepository.findAll()
		.forEach(questionTypes::add);
		return questionTypes;
	}
	
	public QuestionType getQuestionType(String id) {
		return questionTypeRepository.findOne(id);
	}
	
	public QuestionType addQuestionType(QuestionType questionType) {
		questionTypeRepository.save(questionType);
		return questionType;
	}
	
	public QuestionType updateQuestionType(String id, QuestionType questionType) {
		questionTypeRepository.save(questionType);
		return questionType;
	}
	
	public void deleteQuestionType(String id) {
		questionTypeRepository.delete(id);
	}

}
