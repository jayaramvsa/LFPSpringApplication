package com.lfp.myfirstapp.controller;

import com.lfp.myfirstapp.dto.response.Greeting;
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

    @GetMapping("/hello")
    public Greeting greeting(@RequestParam(value = "name", defaultValue="world") String strName) {
        return new Greeting(aCounter.incrementAndGet(),
                String.format(strTemplate,strName));
    }
}
