/*
 * 关系运算符
 * == != < > <= >= instanceof 运算结果为boolean型
 */
public class RelationalOpreator {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
        boolean flag = a > b;
        System.out.println("flag=" + flag);
    }
}
 