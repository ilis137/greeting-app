package com.greetingapp.Controller;


import com.greetingapp.Model.Greeting;
import com.greetingapp.Services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @Autowired
    IGreetingService greetingService;
    @GetMapping("/greeting")
    public Greeting addGreetinng(@RequestParam(value = "fName",required = false) String firstName,
                                 @RequestParam(value = "lName",required = false) String lastName) {
       return greetingService.addGreeting(firstName,lastName);
    }
}
