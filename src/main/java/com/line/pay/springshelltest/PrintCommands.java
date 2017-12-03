package com.line.pay.springshelltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class PrintCommands {

    private final PrintingService service;

    @Autowired
    public PrintCommands(PrintingService service) {
        this.service = service;
    }

    @ShellMethod("Print Hello World")
    public String printHelloWorld(@ShellOption String name) {
        return service.printHelloWorld(name);
    }
}
