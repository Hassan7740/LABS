package com.lap;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Repository;


public class Flat {
    public int myNum = 5 ; 
    Flat(){
    }
    
    public int getMyNum(String text) {
        System.out.println(text);
        return myNum;
    }
}
