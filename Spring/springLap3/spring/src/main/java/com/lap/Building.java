package com.lap;

import org.springframework.beans.factory.annotation.Autowired;

public class Building {
    Flat flat;
    @Autowired
    Building(Flat flat) {
        this.flat = flat;
    }
}
