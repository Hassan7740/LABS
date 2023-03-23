package com.lap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.ejb.Init;

// @Repository
public class Building {
    Building(Flat flat){
        System.out.println("this is the building constractour");
        this.flat = flat ; 
    }
    // @Autowired
    Flat flat ;

    public void init(){
        System.out.println("Building init method");
    }
}
