package awe.mbl.i130.form.section;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionService {
	
	@Autowired
	private SectionRepository sectionRepository;
	
	public List<Section> getAllSections(String formId) {
		List<Section> sections = new ArrayList<>();
		sectionRepository.findByFormId(formId)
				.forEach(sections::add);
		return sections;
	}
	
	public Section getSection(String id) {
		return sectionRepository.findOne(id);
	}
	
	public Section addSection(Section section) {
		sectionRepository.save(section);
		return section;
	}
	
	public Section updateSection(Section section) {
		sectionRepository.save(section);
		return section;
	}
	
	public void deleteSection(String id) {
		sectionRepository.delete(id);
	}

}
