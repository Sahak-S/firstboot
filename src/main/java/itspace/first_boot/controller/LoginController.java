package itspace.first_boot.controller;

import itspace.first_boot.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final Login login;

    public LoginController(Login login) {
        this.login = login;
    }

    @GetMapping("/")
    public String loginGet() {
        return "login";
    }

    @PostMapping("/")
    public String loginPost(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ) {
        login.setUsername(username);
        login.setPassword(password);

        boolean loggedIn = login.login();
        if (loggedIn){
            return "redirect:/main";
//            model.addAttribute("message","You have successfully logged in!");
        }else {
            model.addAttribute("message","You have failed!");
        }
        return "login";
    }
}
