package cgg.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("going to home view..");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("query") String query) {
		String url="https://www.google.co.in/search?q="+query;
		
		RedirectView rv = new RedirectView();
		rv.setUrl(url);
		
		return rv;
	}
}
