package com.line.pay.springshelltest;

import org.springframework.stereotype.Service;

@Service
public class PrintingService {

    public String printHelloWorld(String name) {
        return "Hello World, " + name;
    }
}
