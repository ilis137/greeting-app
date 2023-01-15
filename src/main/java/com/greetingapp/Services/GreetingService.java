package com.greetingapp.Services;

import com.greetingapp.Model.Greeting;

import com.greetingapp.DTO.User;
import com.greetingapp.Repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService{
    private static final String template = "Hello, %s !!!";
    private final AtomicLong counter=new AtomicLong();

    @Autowired
    GreetingRepository greetingRepository;

    @Override
    public Greeting addGreeting(User user) {
        String text=null;
        String firstName= user.getFirstName();
        String lastName=user.getLastName();
        if(!firstName.isEmpty()&&!lastName.isEmpty()){
           text= String.format(template,firstName+" "+lastName);
        }else if(!firstName.isEmpty()||!lastName.isEmpty()){
            text= String.format(template,firstName.isEmpty()?lastName:firstName);
        }else{
            text= String.format(template,"World");
        }
        Greeting newGreeting=new Greeting(counter.incrementAndGet(),text);
        return greetingRepository.save(newGreeting);
    }

    @Override
    public Greeting getGreeting(long id) {
       return greetingRepository.findById(id).get();
    }
}
