package awe.mbl.i130.language.languagetranslation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageTranslationService {
	
	@Autowired
	private LanguageTranslationRepository languageTranslationRepository;
	
	public List<LanguageTranslation> getAllLanguageTranslations(String languageId) {
		List<LanguageTranslation> languageTranslations = new ArrayList<>();
		languageTranslationRepository.findByLanguageId(languageId)
				.forEach(languageTranslations::add);
		return languageTranslations;
	}
	
	public LanguageTranslation getLanguageTranslation(String id) {
		return languageTranslationRepository.findOne(id);
	}
	
	public LanguageTranslation addLanguageTranslation(LanguageTranslation languageTranslation) {
		languageTranslationRepository.save(languageTranslation);
		return languageTranslation;
	}
	
	public LanguageTranslation updateLanguageTranslation(LanguageTranslation languageTranslation) {
		languageTranslationRepository.save(languageTranslation);
		return languageTranslation;
	}
	
	public void deleteLanguageTranslation(String id) {
		languageTranslationRepository.delete(id);
	}

}
