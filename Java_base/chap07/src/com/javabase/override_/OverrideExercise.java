package com.javabase.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 10);
        System.out.println(jack.say());

        Student smith = new Student("smith", 20, 123456, 99.8);
        System.out.println(smith.say());


    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String say() {
        return "name=" + this.name + " age=" + this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        return super.say() + " id=" + id + " score=" + score;
    }
}
