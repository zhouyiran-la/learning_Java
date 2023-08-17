/**
 * 创建Cale类，在其中定义2个操作数属性，定义四个方法实现求和、差、乘、商（除数不能为0）.
 */
public class Homework05 {
    public static void main(String[] args) {
        Cale cale = new Cale(58, 0);
        cale.plus();
        cale.substract();
        cale.multiple();
        cale.divide();
    }
}

class Cale {

    double opera1;
    double opera2;

    public Cale(double opera1, double opera2) {
        this.opera1 = opera1;
        this.opera2 = opera2;
    }

    public void plus() {
        System.out.println(this.opera1 + " + " + this.opera2 + "=" + (this.opera1 + this.opera2));
    }

    public void substract() {
        System.out.println(this.opera1 + " - " + this.opera2 + "=" + (this.opera1 - this.opera2));
    }

    public void multiple() {
        System.out.println(this.opera1 + " - " + this.opera2 + "=" + (this.opera1 * this.opera2));
    }

    public void divide() {
        if(this.opera2 == 0) {
            System.out.println("除数不能为0");
        } else {
            System.out.println(this.opera1 + " / " + this.opera2 + "=" + (this.opera1 / this.opera2));
        }
    }

}
