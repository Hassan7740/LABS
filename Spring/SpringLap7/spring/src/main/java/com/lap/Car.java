package com.lap;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

import jakarta.inject.Named;
public interface Car {
    public int numberOfDoors();
}
