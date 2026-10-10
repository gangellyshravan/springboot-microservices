package com.step1.learning.springboot_microservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping(method = RequestMethod.GET, path = "/welcome")
    public String welcome() {
        return "Welcome";
    }
}
