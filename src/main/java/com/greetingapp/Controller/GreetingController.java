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
    public Greeting getGreetinng() {
       return greetingService.getGreeting();
    }
}
