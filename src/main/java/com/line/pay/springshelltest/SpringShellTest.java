package com.line.pay.springshelltest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringShellTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringShellTest.class, args);
    }

//    @Bean
//    public PromptProvider promptProvider() {
//        return () -> AttributedString("shell:>", AttributedStyle.DEFAULT.foreground(AttributedStyle.YELLOW));
//    }
}
