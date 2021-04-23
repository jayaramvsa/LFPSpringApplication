package com.lfp.myfirstapp.service;

import com.lfp.myfirstapp.dto.User;
import com.lfp.myfirstapp.entity.Greeting;
import com.lfp.myfirstapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService {

    private static final String strTemplate = "Hello, %s!";
    private final AtomicLong aCounter = new AtomicLong();
    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public Greeting addGreeting(User user) {
        String strMessage = String.format(strTemplate,
                (user.toString().isEmpty() ? "Hello world" : user.toString()));
        return greetingRepository.save(new Greeting(aCounter.incrementAndGet(),
                strMessage));
    }

    @Override
    public Greeting getGreetingById(long id) {
        return greetingRepository.findById(id).get();
    }
}
