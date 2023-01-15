package com.greetingapp.Services;

import com.greetingapp.Model.Greeting;
import com.greetingapp.DTO.User;

public interface IGreetingService {
    public Greeting addGreeting(User user);

    Greeting getGreeting(long id);
}
