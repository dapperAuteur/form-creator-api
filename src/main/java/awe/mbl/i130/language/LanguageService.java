package awe.mbl.i130.language;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {
	
	@Autowired
	private LanguageRepository languageRepository;
	
	public List<Language> getAllLanguages() {
		List<Language> languages = new ArrayList<>();
		languageRepository.findAll()
		.forEach(languages::add);
		return languages;
	}
	
	public Language getLanguage(String id) {
		return languageRepository.findOne(id);
	}

	public Language addLanguage(Language language) {
		// TODO Auto-generated method stub
		languageRepository.save(language);
		return language;
	}

	public Language updateLanguage(String id, Language language) {
		// TODO Auto-generated method stub
		languageRepository.save(language);
		return language;
	}

	public void deleteLanguage(String id) {
		// TODO Auto-generated method stub
		languageRepository.delete(id);
	}

}
