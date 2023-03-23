package com.hassan;

import jakarta.persistence.*;
import com.hassan.*;


public class Main {
    public static void main(String[] args) {
        Transaction instance = new Transaction();
        instance.studentTransaction();
        instance.teacherTransaction();
    }
}