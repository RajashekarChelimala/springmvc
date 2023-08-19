package cgg.spring.mvc.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name","Rajuuu");
		model.addAttribute("id",1234);
		List<String> friends = new ArrayList<>();
		friends.add("Farooq");
		friends.add("Vamshi");
		friends.add("Sanjeeva");
		friends.add("Ajay");
		model.addAttribute("friends",friends);
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller..");
		//creating model and view object
		ModelAndView modelAndView = new ModelAndView();
	
		
		//setting the data
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("name","Farooq");
		modelAndView.addObject("rollnumber",1234);
		modelAndView.addObject("date",now);
		
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(100);
		marks.add(90);
		marks.add(91);
		marks.add(93);
		marks.add(95);
		marks.add(96);
		modelAndView.addObject("marks",marks);
		
		//setting the view name
		
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}