package itspace.first_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/home/{color}")
    public String home(
            @PathVariable String color,
            @RequestParam(required = false) String name
            ,Model model ){
        model.addAttribute("username" ,"Poxos" );
        model.addAttribute("color" ,color );
        return "home";
    }
}
