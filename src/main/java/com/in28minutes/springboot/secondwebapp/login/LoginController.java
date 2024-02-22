package com.in28minutes.springboot.secondwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@SessionAttributes("name")
@Controller
public class LoginController {
    Logger logger = LoggerFactory.getLogger(getClass());
    //    @Autowired
    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping("/")
    public String goToLoginPage() {
        logger.debug("I'm in Get-------------------");
        return "/welcome";
    }

    @PostMapping("/login")
    public String goToWelcomePage(@RequestParam String username, @RequestParam String password, ModelMap model) {
        model.addAttribute("name", username);
        model.addAttribute("password", password);
        logger.debug("I'm in post-------------------");
        if (authenticationService.authenticate(username, password)) {
            return "/welcome";
        } else {
            model.put("error", "Credentials Error! please try again");
            return "/login";
        }
    }
}
