package org.example.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Test")
public class TestEnvConfig {
    @Bean
    public User getUser(){
        return new User(13,"Som");
    }
}
