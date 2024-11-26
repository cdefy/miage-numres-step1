package org.aepsilon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // Préfixe commun pour tous les endpoints de ce contrôleur
public class GreetingResource {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}