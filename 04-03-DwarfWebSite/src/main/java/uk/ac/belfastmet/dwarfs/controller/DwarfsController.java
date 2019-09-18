package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class DwarfsController {
	
	@GetMapping()
	public String homePage() {
		
		return "index";
	}
	
	@GetMapping()
	public String disneyPage() {
		
		return "disney";
	}
	
	@GetMapping()
	public String tolkienPage() {
		
		return "tolkien";
	}

}
