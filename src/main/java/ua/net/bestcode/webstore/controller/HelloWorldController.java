package main.java.ua.net.bestcode.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("name", "Guest");

        //returns the view name
        return "helloworld";

    }


}