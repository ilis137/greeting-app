package com.greetingapp.Services;

import com.greetingapp.Model.Greeting;
import com.greetingapp.DTO.User;

import java.util.List;

public interface IGreetingService {
    public Greeting addGreeting(User user);

    Greeting getGreeting(long id);

    List<Greeting> getAllGreetings();

    public Greeting updateGreeting(long id,User user);

    void deleteGreeting(long id);
}
