package com.lfp.myfirstapp.service;

import com.lfp.myfirstapp.dto.User;
import com.lfp.myfirstapp.entity.Greeting;

public interface IGreetingService {

    Greeting addGreeting(User user);

    Greeting getGreetingById(long id);

}
