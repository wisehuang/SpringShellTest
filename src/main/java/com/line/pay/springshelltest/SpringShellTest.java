package com.line.pay.springshelltest;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.jline.PromptProvider;

@SpringBootApplication
public class SpringShellTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringShellTest.class, args);
    }

    @Bean
    public PromptProvider promptProvider() {
        return () -> new AttributedString("shell:>", AttributedStyle.DEFAULT.foreground(AttributedStyle.YELLOW));
    }
}
