package ua.net.bestcode.webstore.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.net.bestcode.webstore.manager.IUserManager;

@Controller
public class HelloWorldController {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);

    @Autowired
    IUserManager userManager;


    @RequestMapping("/")
    public String hello(Model model) {
        LOG.debug("++++++++++");
        int count = userManager.addUserAndReturnCount();
        model.addAttribute("count", count);

        //returns the view name
        return "helloworld";

    }


}