package com.greetingapp.Controller;


import com.greetingapp.Model.Greeting;
import com.greetingapp.DTO.User;
import com.greetingapp.Services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {

    @Autowired
    IGreetingService greetingService;
    @PostMapping("/greeting")
    public Greeting addGreeting(@RequestBody User user) {
       return greetingService.addGreeting(user);
    }

    @GetMapping("/greeting/{id}")
    public Greeting getGreeting(@PathVariable(name="id") long id) {
        return greetingService.getGreeting(id);
    }

    @GetMapping("/greeting/all")
    public List<Greeting> getAllGreeting() {
        return greetingService.getAllGreetings();
    }


    @PutMapping("/greeting/{id}")
    public Greeting updateGreeting(@PathVariable(name="id") long id,@RequestBody User user) {
        return greetingService.updateGreeting(id,user);
    }

    @DeleteMapping("/greeting/{id}")
    public void deleteGreeting(@PathVariable(name="id") long id) {
         greetingService.deleteGreeting(id);
    }
}
