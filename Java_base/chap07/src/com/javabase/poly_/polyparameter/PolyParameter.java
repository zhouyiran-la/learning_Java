package com.javabase.poly_.polyparameter;

public class PolyParameter {
    public void showEmpAnnual(Employee e) {
        System.out.println("年工资:" + e.getAnnual());
    }
    public void testWork(Employee e) {
        if(e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof  Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("类型有误!");
        }
    }

    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500.00);
        Manager milan = new Manager("milan", 5000.00, 20000.00);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.testWork(tom);
        polyParameter.showEmpAnnual(tom);
        polyParameter.testWork(milan);
        polyParameter.showEmpAnnual(milan);
    }
}
