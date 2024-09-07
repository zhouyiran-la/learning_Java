package com.javabase.poly_;

public class Animal {
    private String name;

    public void cry() {
        System.out.println("动物叫...");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void cry() {
        System.out.println("汪汪汪...");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void cry() {
        System.out.println("喵喵喵...");
    }
}

