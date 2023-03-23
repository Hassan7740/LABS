package com.lap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class Building {
    Flat flat;
    @Autowired
    Building(Flat flat) {
        this.flat = flat;
    }
}
