package com.lap;

import org.springframework.stereotype.Component;

@Component
public class DoorImp implements Door{
  
   public int getDoor(){
    return 4 ; 
   }
}
