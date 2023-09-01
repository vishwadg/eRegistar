package edu.mum.cs.cs425.demowebapps.eregistar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value = {"/", "/eregistar", "/eregistar/home"})
    public String displayHomePage(){
        return "home/index";
    }
}
