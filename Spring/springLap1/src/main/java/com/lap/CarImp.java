package com.lap;

public class CarImp  implements Car{
    Door h ; 

    CarImp(Door param){
        this.h = param ; 
    }
   public int numberOfDoors(){
    
    return h.getDoor();
    }

    public String toString(){
        return "this is a car" ;
    }

}
