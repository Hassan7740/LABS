package com.lap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan(basePackages = "com.lap")
@Import(ConfigClass2.class)
@Profile("p1")
public class ConfigClass {
    
    
    // @Bean(name = "flat")
    // @Scope("prototype")
    // public Flat flatBuilder(){
    //     return new Flat();
    // }

    // @Bean(initMethod = "init")
    // public Building buildingBuilder (){
    //    return new Building();
    // }


    @Bean(name = "flat")
    @Scope("prototype")
    public Flat flatBuilder(){
        return new Flat();
    }

    @Bean(initMethod = "init")
    public Building buildingBuilder (){
       return new Building(flatBuilder());
    }
    
    @Bean
    public Car carBuilder(){
        System.out.println("this profile 1");
        return new CarImp();
    }
   

    @Bean
    public Door  doorBuilder(){
        return new DoorImp();
    }

    
}
