package org.example.Profile_with_Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {
    @Bean
    @Profile({"Dog","Cow","Horse"})
    DomesticAnimal domesticAnimal(){
        return new DomesticAnimal();
    }

    @Bean
    @Profile({"Lion"})
     Lion lion(){
        return new Lion();

    }

}
