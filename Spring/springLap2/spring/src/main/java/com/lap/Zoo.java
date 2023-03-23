package com.lap;
import com.lap.Animal;
import java.util.List;

public class Zoo {
    private List<Animal> animals ;
    
    public Zoo(){
        System.out.println("this is a zoo");
    }
    
   

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    } 
}
