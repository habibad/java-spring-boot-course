package com.anikur.practice;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int rollNO;
    private int marks;
    @Autowired
    @Qualifier("laptop")
    private Computer com;
    public void computerCalling(){
        com.code();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNO() {
        return rollNO;
    }

    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNO=" + rollNO +
                ", marks=" + marks +
                ", com=" + com +
                '}';
    }

    public void print(){
        System.out.println("student name: "+name+"\tRoll No: "+rollNO+"\tMarks: "+marks);
    }
}
