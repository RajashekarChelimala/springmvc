package cgg.spring.mvc.controllers;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ReController {
    
    @RequestMapping("/one")
//    public String one() {
    
//    public void one(HttpServletResponse res) {
    public RedirectView one() {
        System.out.println("This is first handler..");
        
        RedirectView rv = new RedirectView();
//      	rv.setUrl("two");
        rv.setUrl("https://www.google.co.in/");
        return rv;
        
//        return "redirect:https://www.google.co.in/";
    }
    
    @RequestMapping("/two")
    public String two() {
        System.out.println("This is second handler..");
        return "contact";
    }
}
