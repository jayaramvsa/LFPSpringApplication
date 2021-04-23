package com.lfp.myfirstapp.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class GreetingResponse {
    private String format;
    private long counter;

    public GreetingResponse(long l, String format) {
        this.format = format;
        this.counter = l;
    }
}
