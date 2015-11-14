package ua.net.bestcode.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.net.bestcode.webstore.manager.IUserManager;

@Controller
public class HelloWorldController {
    @Autowired
    IUserManager userManager;


    @RequestMapping("/")
    public String hello(Model model) {
        int count = userManager.addUserAndReturnCount();
        model.addAttribute("count", count);

        //returns the view name
        return "helloworld";

    }


}