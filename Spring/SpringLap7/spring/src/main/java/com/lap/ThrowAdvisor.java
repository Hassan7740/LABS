package com.lap;

import org.springframework.aop.ThrowsAdvice;

public class ThrowAdvisor implements ThrowsAdvice {
    public void afterThrowing(Exception ex){  
        System.out.println("what happens after through exception");  
    }  
    
}
