package uk.ac.belfastmet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class TaskController {

	Logger logger = LoggerFactory.getLogger(TaskController.class);

//ADD JAVA DOC HERE TO EXPLAIN YOUR PARAMETER AND WHATS BEING RETURNED
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String homepage(Model model) {

//		String message = "lee message";

		model.addAttribute("message", "CIARA message"); 
		logger.info("Getting the homepage");
		return "index";

	}

}
