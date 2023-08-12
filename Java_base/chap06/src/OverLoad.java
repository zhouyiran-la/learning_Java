/**
 * 方法重载：同一类中，允许存在多个同名方法，参数列表必须有区别.
 * - 方法名必须相同
 * - 参数类型、个数和顺序有区别，参数名无要求
 * - 返回值无要求
 * 
 */

public class OverLoad {

    public static void main(String[] args) {

            MyCalculator mc = new MyCalculator();
            System.out.println(mc.calculate(1, 2));
            System.out.println(mc.calculate(1.1, 2));
            System.out.println(mc.calculate(1, 2.2));
            System.out.println(mc.calculate(1, 2, 3));
    }
    

}

class MyCalculator {

    public int calculate(int n1, int n2) {
        return n1 + n2;
    }

    public double calculate(int n1, double n2) {
        return n1 + n2;
    }

    public double calculate(double n1, int n2) {
        return n1 + n2;
    }

    public int calculate(int n1, int n2, int n3) {
        return n1 + n2 + n3; 
    }
}
