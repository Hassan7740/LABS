package com.lap;

import org.springframework.stereotype.Repository;

@Repository
public class Flat {
    Flat(){
        System.out.println("this is a flat constuctor");
    }
}
