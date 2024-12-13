package homework;

/**
 * @author zyr
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        // 记得要传参
        }, 10, 8);

    }
}

class CellPhone {
    public void testWork(Calculator cal, double n1, double n2) {
        cal.work(n1, n2);
    }
}


interface Calculator{
    double work(double n1, double n2);

}