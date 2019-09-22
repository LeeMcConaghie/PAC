package uk.ac.belfastmet.bluesrock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.bluesrock.service.AlbumService;


@Controller
@RequestMapping
public class BluesRockController {
	
	Logger logger = LoggerFactory.getLogger(BluesRockController.class);

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String homepage() {
		logger.info("Getting home page");
		return "index";
	}
	
	@RequestMapping(value = "/albums", method = RequestMethod.GET)
	public String albumsPage(Model model) {
		
		
		AlbumService bluesRockTop10Service = new AlbumService();
		model.addAttribute("pageTitle", "Blues Rock Top 10");
		model.addAttribute("albumHold", bluesRockTop10Service.getAlbums());
		return "albums";
	}
	
	@RequestMapping(value = "/band", method = RequestMethod.GET)
	public String bandPage(Model model) {
		
		
		AlbumService bluesRockTop10Service = new AlbumService();
		model.addAttribute("pageTitle", "Blues Rock Top 10");
		model.addAttribute("albumHold", bluesRockTop10Service.getAlbums());
		return "band";
	}
	

}
