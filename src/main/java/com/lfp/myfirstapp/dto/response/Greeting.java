package com.lfp.myfirstapp.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Greeting {
    private String format;
    private long counter;

    public Greeting(long l, String format) {
        this.format = format;
        this.counter = l;
    }
}
