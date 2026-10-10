package com.step1.learning.springboot_microservices.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(path = "/welcome")
    public String welcome() {
        return "Welcome Get Mapping";
    }

    @GetMapping(path = "/welcome-bean")
    public WelcomeBean welcomeBean() {
        return new WelcomeBean("Welcome Get Mapping");
    }
}
