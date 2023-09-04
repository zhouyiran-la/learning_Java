package com.javabase.extend_;

public class ExtendsExercise {
    public static void main(String[] args) {

        PC pc = new PC("intel", 16, 512, "联想");
        pc.printInfo();

        pc.setBrand("戴尔");
        pc.printInfo();

        NotePad notePad = new NotePad("M1", 8, 128, "深空灰");
        notePad.printInfo();

        notePad.setColor("极光银");
        notePad.printInfo();
    }
}

class Computer {

    private  String cpu;
    private int memory;
    private  int disk;

    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public String getDetails() {
        return "cpu=" + cpu + " memory=" + memory + " disk=" + disk;
    }
}

class PC extends Computer {

    private String brand;

    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("PC信息如下：");
        System.out.println(getDetails() + " brand=" + brand);

    }
}

class NotePad extends Computer {

    private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.println("NotePad信息如下：");
        System.out.println(getDetails() + " color=" + color);
    }
}