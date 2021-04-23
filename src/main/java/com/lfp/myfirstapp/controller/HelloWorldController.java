package com.lfp.myfirstapp.controller;

import com.lfp.myfirstapp.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello World!!!";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "firstName") String fName,
                           @RequestParam(value = "lastName") String lName) {
        return "Hello " + fName + " " + lName + "!!";
    }

    @GetMapping("/param/{strName}")
    public String sayHelloParam(@PathVariable String strName) {
        return "Hello " + strName + " !!";
    }

    @RequestMapping(value = {"/greeting"}, method = RequestMethod.POST)
    public String sayHelloUser(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName();
    }

    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName,
                              @RequestParam(value = "lastname") String lastName) {
        return "Hello " + firstName + " " + lastName + " !!";
    }

}
