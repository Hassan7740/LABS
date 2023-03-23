package com.lap;


import org.springframework.beans.factory.annotation.Autowired;

import jakarta.annotation.Resource;
public class Room {
    @Resource
    Door doorRoom ;

    public Room(){
        System.out.println("this is room constructor");
        
    }

    public Door getdoorRoom() {
        System.out.print(doorRoom);
        return doorRoom;
    }
    
    public void setdoorRoom(Door doorRoom) {
        this.doorRoom = doorRoom;
    }

}
