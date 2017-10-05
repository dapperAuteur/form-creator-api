package awe.mbl.i130.form.section;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SectionRepository extends CrudRepository<Section, String> {
	
	public List<Section> findByFormId(String formId);

}
