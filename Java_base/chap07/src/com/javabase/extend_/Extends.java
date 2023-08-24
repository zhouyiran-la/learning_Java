package com.javabase.extend_;
/*
继承的核心功能：提高代码复用性
 */
public class Extends {
    public static void main(String[] args) {

        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.info();

        System.out.println("===============");

        Graduate graduate = new Graduate();
        graduate.name = "老明";
        pupil.age = 20;
        graduate.testing();
        graduate.setScore(85);
        graduate.info();

    }
}
