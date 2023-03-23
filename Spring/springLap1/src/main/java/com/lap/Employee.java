package com.lap;

public class Employee implements Person  {
   private String name ; 
   private int age ;
   private boolean isMarried ;
   private Car car ; 

   @Override
   public Car carType() {
       return car ;
   }

   public void setCar(Car car){
    this.car = car ; 
   }
    
    public Employee(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

    public String toString(){
        return "name is " + this.name + " age is " + this.age +" Married : " + this.isMarried ; 
    }
     
}
