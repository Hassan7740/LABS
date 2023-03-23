package com.lap;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Dog implements Animal  {
    
    Dog(){
        System.out.println("hi this is a dog");
    }
    
    @PostConstruct
     public void init(){
        System.out.println("init dog method hi");
    }
     public void init2(){
        System.out.println("init2 dog method hi");
    }
    @PreDestroy
     public void destroy(){
        System.out.println("destroy dog method hi");
    }
}
