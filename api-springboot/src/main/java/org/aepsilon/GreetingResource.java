package org.aepsilon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingResource {

    @GetMapping("/hello")
    public String sayHello() {
        return "G'day, World!";
    }
}