package com.greetingapp.Controller;


import com.greetingapp.Model.Greeting;
import com.greetingapp.DTO.User;
import com.greetingapp.Services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @Autowired
    IGreetingService greetingService;
    @PostMapping("/greeting")
    public Greeting addGreetinng(@RequestBody User user) {
       return greetingService.addGreeting(user);
    }

    @GetMapping("/greeting/{id}")
    public Greeting addGreetinng(@PathVariable(name="id") long id) {
        return greetingService.getGreeting(id);
    }

}
