package com.example.jdkupdate.global;

import org.jline.utils.AttributedString;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ShellConfig implements PromptProvider {
    @Override
    public AttributedString getPrompt() {
        return new AttributedString("JUNNYLAND > ");
    }
}
