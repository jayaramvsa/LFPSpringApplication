package com.lfp.myfirstapp.controller;

import com.lfp.myfirstapp.dto.User;
import com.lfp.myfirstapp.dto.response.GreetingResponse;
import com.lfp.myfirstapp.entity.Greeting;
import com.lfp.myfirstapp.service.GreetingService;
import com.lfp.myfirstapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private static final String strTemplate = "Hello, %s!";
    private final AtomicLong aCounter = new AtomicLong();

    @Autowired
    private GreetingService greetingService;



    @GetMapping("/hello")
    public GreetingResponse greeting(@RequestParam(value = "name", defaultValue="world") String strName) {
        return new GreetingResponse(aCounter.incrementAndGet(),
                String.format(strTemplate,strName));
    }

    @GetMapping("/new")
    public Greeting save(@RequestParam(value = "name", defaultValue="world") String strName){
        User user = new User();
        user.setFirstName(strName);
        return greetingService.addGreeting(user);
    }

    @GetMapping("/getId")
    public Greeting getGreeting(@RequestParam(value = "id") long id){
        return greetingService.getGreetingById(id);
    }
}
