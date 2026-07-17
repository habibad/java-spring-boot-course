package com.anikur.practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class Desktop implements  Computer{
    @Override
    public void code() {
        System.out.println("Desktop code is calling");
    }
}
