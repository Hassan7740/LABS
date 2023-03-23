package com.lap;
import java.util.LinkedHashMap;
import java.util.Map;
public class Company {
    LinkedHashMap<String,Employee> attendes ;

    public LinkedHashMap<String, Employee> getAttendes() {
        return attendes;
    }

    public void setAttendes(LinkedHashMap<String, Employee> attendes) {
        this.attendes = attendes;
    } 

    public void printMap(){
        for (Map.Entry mp: attendes.entrySet()) {
            System.out.println(mp.getKey());
        }
    }
}
