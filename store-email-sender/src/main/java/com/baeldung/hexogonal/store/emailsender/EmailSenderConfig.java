package com.baeldung.hexagonal.store.emailsender;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.baeldung.hexagonal.store.emailsender"})
public class EmailSenderConfig {
}
