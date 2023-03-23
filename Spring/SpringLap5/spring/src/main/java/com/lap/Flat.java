package com.lap;

import org.springframework.stereotype.Repository;

// @Repository
public class Flat {
    public int myNum = 5 ; 
    Flat(){
        System.out.println("this is a flat constuctor");
    }
    public int getMyNum() {
        return myNum;
    }
}
