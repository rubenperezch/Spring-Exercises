package com.gfa.introtospring.Controllers;

import com.gfa.introtospring.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/rest")
    public String restControl(){
        return "This is body of response";
    }

    @GetMapping("/greeting")
    public User greetingPage() {
        User user = new User("Patrick", 32);
        return user;
    }
}
