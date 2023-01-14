package com.greetingapp.Services;

import com.greetingapp.Model.Greeting;

import com.greetingapp.Model.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService{
    private static final String template = "Hello, %s !!!";
    private final AtomicLong counter=new AtomicLong();
    @Override
    public Greeting addGreeting(String firstName,String lastName) {
        String text=null;
        if(firstName!=null&&lastName!=null){
           text= String.format(template,firstName+" "+lastName);
        }else if(firstName!=null||lastName!=null){
            text= String.format(template,firstName==null?lastName:firstName);
        }else{
            text= String.format(template,"World");
        }
        return new Greeting(counter.incrementAndGet(),text);
    }
}
