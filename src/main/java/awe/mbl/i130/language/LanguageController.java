package awe.mbl.i130.language;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {
	
	@Autowired
	private LanguageService languageService;
	
	@RequestMapping("/languages")
	public List<Language> getAllLanguages() {
		return languageService.getAllLanguages();
	}
	
	@RequestMapping("/languages/{id}")
	public Language getLanguage(@PathVariable String id) {
		return languageService.getLanguage(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/languages")
	public Language addLanguage(@RequestBody Language language) {
		return languageService.addLanguage(language);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/languages/{id}")
	public Language addLanguage(@RequestBody Language language, @PathVariable String id) {
		languageService.updateLanguage(id, language);
		return language;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/languages/{id}")
	public void deleteLanguage(@PathVariable String id) {
		languageService.deleteLanguage(id);
	}

}
