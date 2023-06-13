package com.example.jdkupdate.global;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class LogConfig implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("======================");
        System.out.println("=WELTOME TO JUNNYLAND=");
        System.out.println("=BASH SHELL          =");
        System.out.println("======================");
    }
}
