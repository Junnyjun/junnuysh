package com.example.jdkupdate.echo.commander;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class echoCommand {
    @ShellMethod(key = {"echo"}, value = "Welcome to junnyland")
    void echo(
            @ShellOption(value = {"-w","wide"}, defaultValue = "Welcome to junnyland") String welcome
    ) {
        System.out.println(welcome);
    }

}
