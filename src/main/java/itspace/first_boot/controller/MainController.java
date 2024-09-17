package itspace.first_boot.controller;

import itspace.first_boot.services.LoggerUserManagementServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final LoggerUserManagementServices loggerUserManagementServices;
    private final LoginCountServices loginCountServices;

    public MainController(LoggerUserManagementServices loggerUserManagementServices, LoginCountServices loginCountServices) {
        this.loggerUserManagementServices = loggerUserManagementServices;
        this.loginCountServices = loginCountServices;
    }

    @GetMapping("/main")
    public String main(
            @RequestParam(required = false) String logout,
            Model model) {
        if (logout != null) {
            loggerUserManagementServices.setUsername(null);
        }
        String username = loggerUserManagementServices.getUsername();
        int count = loginCountServices.getCount();
        if (username == null){
            return "redirect:/";
        }
        model.addAttribute("username", username);
        model.addAttribute("loginCount", count);
        return "main";
    }
}
