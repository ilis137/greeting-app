package com.greetingapp.Services;

import com.greetingapp.Model.Greeting;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService{
    private static final String template = "Hello, World !!!";
    private final AtomicLong counter=new AtomicLong();
    @Override
    public Greeting getGreeting() {
            return new Greeting(counter.incrementAndGet(), template);
    }
}
