package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong counter = new AtomicLong();
    @GetMapping("/greeting")
    public String greeting(@RequestParam String name, @RequestParam long number) {

        //Greeting greeting = new Greeting("Javier", 2345);
        String greet = "Counter: " + counter.intValue() + " Hello " + name + " your ID is " + number + ". Abandon all hope, now that you entered";
        counter.addAndGet(1);
        return greet;
    }

}
