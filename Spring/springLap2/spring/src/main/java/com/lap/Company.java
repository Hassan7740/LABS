package com.lap;
import java.util.LinkedHashMap;
public class Company {
    LinkedHashMap<String,Person> attendes ;

    public LinkedHashMap<String, Person> getAttendes() {
        return attendes;
    }

    public void setAttendes(LinkedHashMap<String, Person> attendes) {
        this.attendes = attendes;
    } 
}
