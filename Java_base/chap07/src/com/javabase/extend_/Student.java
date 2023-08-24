package com.javabase.extend_;

public class Student {

    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void info() {
        System.out.println("name=" + name + " age=" + age + " score=" + score) ;
    }
}
