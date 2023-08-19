package cgg.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cgg.spring.mvc.model.Users;
import cgg.spring.mvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","Learning Spring MVC");
		m.addAttribute("Desc","Home for Programmers");
		System.out.println("Adding common Data..");
	}
	
	@RequestMapping("/contacts")
	public String showForm() {
		System.out.println("Creating Form...");
		return "contact";
	}
	
	@RequestMapping(path="/processForm", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") Users user, Model model) {
//		@RequestParam("email") String email, 
//		@RequestParam("username") String name, 
//		@RequestParam("password") String password
//		handleForm(HttpServletRequest req)
//		req.getParameter("email");
		
//		User user = new User();
//		user.setEmail(email);
//		user.setUserName(name);
//		user.setPassword(password);
		
		System.out.println(user);
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg","User Created With ID: "+createUser);
		
//		model.addAttribute("user",user);
		
//		System.out.println(email+" "+name+" "+password);
//		
//		model.addAttribute("email",email);
//		model.addAttribute("name",name);
//		model.addAttribute("password",password);
		
		if(user.getUserName().isBlank()) {
			return "redirect:/contacts";
		}
		return "success";
	}
	
}
