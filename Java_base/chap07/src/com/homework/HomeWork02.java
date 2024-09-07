package com.homework;

public class HomeWork02 {
    public static void main(String[] args) {
        Worker worker = new Worker("111", 2000);
        Teacher teacher = new Teacher("222", 3000);
        Scientist scientist = new Scientist("333", 20000);
        worker.printSal();

        teacher.setClassDays(300);
        teacher.setClassSal(600);
        teacher.printSal();
        scientist.setBonus(500000);
        scientist.printSal();

    }
}

class Employee {
    String name;
    private double sal;
    private int salMonth = 12;

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    public void printSal() {
        System.out.println(name + " 年工资是：" + (sal * salMonth));
    }
}

class Worker extends Employee {
    public Worker(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printSal() {
        System.out.print("工人 ");
        super.printSal();
    }
}

class Teacher extends Employee {
    private int classDays;
    private double classSal;

    public Teacher(String name, double sal) {
        super(name, sal);
    }

    public int getClassDays() {
        return classDays;
    }

    public void setClassDays(int classDays) {
        this.classDays = classDays;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    @Override
    public void printSal() {
        System.out.print("老师 ");
        System.out.println(getName() + " 年工资是 " + (getSal() * getSalMonth() + classSal * classDays));
    }
}

class Scientist extends Employee {
    private double bonus;

    public Scientist(String name, double sal) {
        super(name, sal);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.print("科学家 ");
        System.out.println(getName() + " 年工资是 " + (getSal() * getSalMonth() + bonus));
    }
}
