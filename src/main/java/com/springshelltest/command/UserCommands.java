package com.springshelltest.command;

import com.springshelltest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class UserCommands {

    private final UserService service;

    @Autowired
    public UserCommands(UserService service) {
        this.service = service;
    }

    @ShellMethod("Get User By Id")
    public String getUser(@ShellOption int id) {
        return service.get(id);
    }
}
