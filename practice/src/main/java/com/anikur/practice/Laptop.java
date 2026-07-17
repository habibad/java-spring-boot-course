package com.anikur.practice;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    @Override
    public void code() {
        System.out.println("laptop code working");
    }
}
