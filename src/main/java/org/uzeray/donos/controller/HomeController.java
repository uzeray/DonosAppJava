package org.uzeray.donos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.uzeray.donos.methods.UserMethods;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    private final UserMethods uMethods;

    public HomeController(UserMethods uMethods) {
        this.uMethods = uMethods;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<String> menuItems = Arrays.asList("Home", "About", "Contact");
        model.addAttribute("menuItems", menuItems);
        int UID = uMethods.getUserId();
        model.addAttribute("UID", UID);
        return "home";
    }
}
