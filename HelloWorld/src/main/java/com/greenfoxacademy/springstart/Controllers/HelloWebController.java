package com.greenfoxacademy.springstart.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/web/greeting")
public class HelloWebController {

    AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public String greeting(Model model, @RequestParam String name) {

        String buzzWord = "";
        String font = "";
        if (counter.get()%3 == 0) {
            buzzWord = "Fizz";
            font = "24px";
        } else if (counter.get()%5 == 0) {
            buzzWord = "Buzz";
            font = "48px";
        } else if (counter.get()%5 == 0 && counter.get()%3 == 0) {
            buzzWord = "Buzz";
            font = "72px";
        } else {
            buzzWord = counter.get() + "";
            font = "12px";
        }
        model.addAttribute("name", name);
        model.addAttribute("counter",buzzWord);
        model.addAttribute("font",font);
        counter.addAndGet(1);
        return "greeting";
    }


}
