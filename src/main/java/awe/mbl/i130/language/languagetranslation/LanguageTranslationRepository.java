package awe.mbl.i130.language.languagetranslation;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LanguageTranslationRepository extends CrudRepository<LanguageTranslation, String> {
	
	public List<LanguageTranslation> findByLanguageId(String languageId);

}
