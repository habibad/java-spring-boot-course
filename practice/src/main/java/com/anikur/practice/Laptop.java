package com.anikur.practice;
import org.springframework.stereotype.Repository;

@Repository
public class Laptop implements Computer{
    @Override
    public void code() {
        System.out.println("laptop code working");
    }
}
