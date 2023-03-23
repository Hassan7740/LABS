package com.lap;


public class Student implements Person {
    Car car ;
    public void setCar (Car inputParam){
        this.car = inputParam ; 
    }

    public Car getCar(){
        return car ;
    }

    @Override
    public Car carType() {
        return car ; 
    }
    
}
