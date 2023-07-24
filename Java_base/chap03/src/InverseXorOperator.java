/*
 * ! 非
 * ^ 异或
 */
public class InverseXorOperator {
    public static void main(String[] args) {
        
        System.out.println(60 > 90);
        System.out.println(!(60 > 90));

        boolean b = (10 > 1) ^ (3 < 5);
        System.out.println("b=" + b);// false
    }
}
