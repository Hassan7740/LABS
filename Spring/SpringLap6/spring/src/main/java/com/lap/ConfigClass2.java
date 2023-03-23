package com.lap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("p2")
public class ConfigClass2 {

    @Bean
    public Car carBuilder(){
        System.out.println("this profile 2");
        return new CarImp();
    }

   
}
