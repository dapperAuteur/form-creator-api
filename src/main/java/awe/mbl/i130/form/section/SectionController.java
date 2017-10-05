package awe.mbl.i130.form.section;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import awe.mbl.i130.form.Form;

@RestController
public class SectionController {
	
	@Autowired
	private SectionService sectionService;
	
	@RequestMapping("/forms/{id}/sections")
	public List<Section> getAllSections(@PathVariable String id) {
		return sectionService.getAllSections(id);
	}
	
	@RequestMapping("/forms/{formId}/sections/{id}")
	public Section getSection(@PathVariable String id) {
		return sectionService.getSection(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/forms/{formId}/sections")
	public Section addSection(@RequestBody Section section, @PathVariable String formId) {
		section.setForm(new Form(formId, "", ""));
		sectionService.addSection(section);
		return section;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/forms/{formId}/sections/{id}")
	public Section updateSection(@RequestBody Section section, @PathVariable String formId) {
		section.setForm(new Form(formId, "", ""));
		sectionService.updateSection(section);
		return section;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/forms/{formId}/sections/{id}")
	public void deleteSection(@PathVariable String id) {
		sectionService.deleteSection(id);
	}

}
