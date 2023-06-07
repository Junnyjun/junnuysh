package com.example.jdkupdate.global;

import org.springframework.boot.Banner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.shell.boot.SpringShellProperties;
import org.springframework.shell.standard.commands.History;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class LogConfig implements Banner {
    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        out.println("======================");
        out.println("=WELTOME TO JUNNYLAND=");
        out.println("=BASH SHELL          =");
        out.println("======================");
    }
}
