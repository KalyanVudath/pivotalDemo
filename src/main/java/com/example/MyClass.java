package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
	
	@RequestMapping("/getClass")
	public String getClassDetails(){		
		return "Spring boot Demo";
	}

}
