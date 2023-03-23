package com.lap;

import org.springframework.beans.factory.annotation.Autowired;

public class CarImp implements Car {
    @Autowired
    Door door;

    public void setDoor(Door door) {
        this.door = door;
    }

    public CarImp() {

    }

    public CarImp(Door param) {
        this.door = param;
        System.out.println("this is a car constractour");
    }

    public int numberOfDoors() {

        return door.getDoor();
    }

    public String toString() {
        return "this is a car";
    }

}
