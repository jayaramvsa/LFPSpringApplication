package com.lfp.myfirstapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String firstName;
    private String lastName;



    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
