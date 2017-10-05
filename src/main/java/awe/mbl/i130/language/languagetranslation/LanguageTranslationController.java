package awe.mbl.i130.language.languagetranslation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import awe.mbl.i130.language.Language;

@RestController
public class LanguageTranslationController {
	
	@Autowired
	private LanguageTranslationService languageTranslationService;
	
	@RequestMapping("/languages/{id}/languageTranslations")
	public List<LanguageTranslation> getAllLanguageTranslations(@PathVariable String id) {
		return languageTranslationService.getAllLanguageTranslations(id);
	}
	
	@RequestMapping("/languages/{languageId}/languageTranslations/{id}")
	public LanguageTranslation getLanguageTranslation(@PathVariable String id) {
		return languageTranslationService.getLanguageTranslation(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/languages/{languageId}/languageTranslations")
	public LanguageTranslation addLanguageTranslation(@RequestBody LanguageTranslation languageTranslation, @PathVariable String languageId) {
		languageTranslation.setLanguage(new Language(languageId, ""));
		languageTranslationService.addLanguageTranslation(languageTranslation);
		return languageTranslation;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/languages/{languageId}/languageTranslations/{id}")
	public LanguageTranslation updateLanguageTranslation(@RequestBody LanguageTranslation languageTranslation, @PathVariable String languageId) {
		languageTranslation.setLanguage(new Language(languageId, ""));
		languageTranslationService.updateLanguageTranslation(languageTranslation);
		return languageTranslation;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/languages/{languageId}/languageTranslations/{id}")
	public void deleteLanguageTranslation(@PathVariable String id) {
		languageTranslationService.deleteLanguageTranslation(id);
	}

}
