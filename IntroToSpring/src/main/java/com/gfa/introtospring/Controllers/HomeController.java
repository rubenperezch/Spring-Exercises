package com.gfa.introtospring.Controllers;

import com.gfa.introtospring.Model.User;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/")
    // @RequestMapping(method = RequestMethod.GET, value = "/") OLD METHOD
    public String homePage() {
        return "index";
    }

    @GetMapping("/greeting")
    @ResponseBody
    public User greetingPage() {
        User user = new User("Patrick", 32);
        return user;
    }

    /* /home/greeting/user?name=Amy&age=20 */
    @GetMapping("/greeting/user")
    @ResponseBody
    public String greetingUser(@RequestParam(required = false, defaultValue = "USER") String name, @RequestParam(required = false, defaultValue = "-1") Integer age){
        String greet = "Hello " + name + " you are " + age + " years old, welcome to our page!";
        return greet;
    }
}
