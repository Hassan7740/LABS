package com.myservlet;

import jakarta.xml.soap.Name;

/**
 * Oreo
 */
public class Oreo {

    private String name ;

    Oreo(String name){
        this.name = name ;
    };

    public String getName(){
        return name ; 
    }  
}