package com.javabase.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("mary", 18, 100);
        persons[2] = new Student("smith", 19, 30.1);
        persons[3] = new Teacher("scott", 30, 20000.00);
        persons[4] = new Teacher("king", 50, 25000.00);

        for(int i = 0; i< persons.length; i++) {
            // 编译类型时Person，运行类型根据实际情况由JVM判断
            persons[i].say(); // 动态绑定机制

            if(persons[i] instanceof Student) {
                ((Student) persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            }
            else if (persons[i] instanceof Person) {
                continue;
            }
            else {
                System.out.println("类型有误");
            }
        }


    }

}


