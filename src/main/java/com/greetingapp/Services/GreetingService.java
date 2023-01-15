package com.greetingapp.Services;

import com.greetingapp.Model.Greeting;

import com.greetingapp.DTO.User;
import com.greetingapp.Repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService {
    private static final String template = "Hello, %s !!!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    GreetingRepository greetingRepository;

    @Override
    public Greeting addGreeting(User user) {
        Greeting newGreeting = new Greeting(counter.incrementAndGet(), getText(user));
        return greetingRepository.save(newGreeting);
    }

    @Override
    public Greeting getGreeting(long id) {
        return greetingRepository.findById(id).get();
    }

    @Override
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    @Override
    public Greeting updateGreeting(long id, User user) {
        Greeting greeting = getGreeting(id);
        greeting.setText(getText(user));
        return greetingRepository.save(greeting);
    }

    @Override
    public void deleteGreeting(long id) {
         greetingRepository.deleteById(id);
    }

    public String getText(User user) {
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        if (!firstName.isEmpty() && !lastName.isEmpty()) {
            return String.format(template, firstName + " " + lastName);
        } else if (!firstName.isEmpty() || !lastName.isEmpty()) {
            return String.format(template, firstName.isEmpty() ? lastName : firstName);
        } else {
            return String.format(template, "World");
        }

    }
}
