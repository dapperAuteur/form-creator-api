package awe.mbl.i130.form;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;

import awe.mbl.i130.form.Form;
import awe.mbl.i130.form.FormService;

//@RestController
public class FormController {
	
	@Autowired
	private FormService formService;
	
	@RequestMapping("/forms")
	public List<Form> getAllForms() {
		return formService.getAllForms();
	}
	
	@RequestMapping("/forms/{id}")
	public Form getForm(@PathVariable String id) {
		return formService.getForm(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/forms")
	public Form addForm(@RequestBody Form form) {
		return formService.addForm(form);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/forms/{id}")
	public Form addForm(@RequestBody Form form, @PathVariable String id) {
		formService.updateForm(id, form);
		return form;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/forms/{id}")
	public void deleteForm(@PathVariable String id) {
		formService.deleteForm(id);
	}

}
