package com.greetingapp.Controller;


import com.greetingapp.Model.Greeting;
import com.greetingapp.Model.User;
import com.greetingapp.Services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @Autowired
    IGreetingService greetingService;
    @PostMapping("/greeting")
    public Greeting addGreetinng(@RequestBody User user) {
       return greetingService.addGreeting(user);
    }

}
