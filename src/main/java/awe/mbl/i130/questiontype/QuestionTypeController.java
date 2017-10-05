package awe.mbl.i130.questiontype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class QuestionTypeController {
	
	@Autowired
	private QuestionTypeService questionTypeService;
	
	@RequestMapping("/questionTypes")
	public List<QuestionType> getAllQuestionTypes() {
		return questionTypeService.getAllQuestionTypes();
	}
	
	@RequestMapping("/questionTypes/{id}")
	public QuestionType getQuestionType(@PathVariable String id) {
		return questionTypeService.getQuestionType(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/questionTypes")
	public QuestionType addQuestionType(@RequestBody QuestionType questionType) {
		return questionTypeService.addQuestionType(questionType);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/questionTypes/{id}")
	public QuestionType addQuestionType(@RequestBody QuestionType questionType, @PathVariable String id) {
		questionTypeService.updateQuestionType(id, questionType);
		return questionType;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/questionTypes/{id}")
	public void deleteQuestionType(@PathVariable String id) {
		questionTypeService.deleteQuestionType(id);
	}

}
