package org.example.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProdEnvConfig {
    @Bean
    public User getUser(){
        return new User (100,"Tom");
    }
}
