/*
 * Java整数类型
 * byte[1]      short[2]
 * int[4]       long[8]
 */
public class IntDetail {
    public static void main(String[] args) {
        
        //Java整型常量默认int型，声明long型常量要加'l'或'L'
        final int a = 11111;
        //final int b = 11111L; 不正确
        //final long c = 1111111111111; 不正确
        final long d = 1111111111111L;

        System.out.println(a);
        System.out.println(d);
    }
}
