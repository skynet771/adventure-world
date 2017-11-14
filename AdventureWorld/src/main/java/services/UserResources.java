package services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResources {

	@RequestMapping("/")
	public String welcomeMemo() {
		return "Welcome to Adventure world! v0.1";
	}
	
	
}
