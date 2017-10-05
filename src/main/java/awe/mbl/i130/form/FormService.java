package awe.mbl.i130.form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import awe.mbl.i130.form.Form;

@Service
public class FormService {
	
	@Autowired
	private FormRepository formRepository;
	
//	private List<Form> forms = new ArrayList<>(Arrays.asList(
//			new Form("1", "Petition for Relative: I-130", "I-130"),
//			new Form("2", "Citizenship Application: N-400", "N-400"),
//			new Form("3", "Greencard Renewal: I-90", "I-90")
//			));
	
	public List<Form> getAllForms() {
		List<Form> forms = new ArrayList<>();
		formRepository.findAll()
		.forEach(forms::add);
		return forms;
	}
	
	public Form getForm(String id) {
//		return forms.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return formRepository.findOne(id);
	}

	public Form addForm(Form form) {
		// TODO Auto-generated method stub
//		forms.add(form);
		formRepository.save(form);
		return form;
	}

	public Form updateForm(String id, Form form) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < forms.size(); i++) {
//			Form t = forms.get(i);
//			if (t.getId().equals(id)) {
//				forms.set(i, form);
//				return form;
//			}
//		}
		formRepository.save(form);
		return form;
	}

	public void deleteForm(String id) {
		// TODO Auto-generated method stub
//		forms.removeIf(t -> t.getId().equals(id));
		formRepository.delete(id);
	}

}
