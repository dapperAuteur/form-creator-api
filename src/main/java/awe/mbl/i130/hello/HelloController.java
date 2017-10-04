package awe.mbl.i130.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/word-up")
	public String wordUp() {
		
		return "hey!";
	}

}
