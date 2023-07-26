/*
 * 四种进制演示
 * 二进制   0b开头
 * 十进制
 * 八进制   0开头
 * 十六进制 0x开头
 */
public class BinaryTest {

    public static void main(String[] args) {
        
        int n1 = 0b1010;//二进制
        int n2 = 1010;  //十进制
        int n3 = 01010; //八进制
        int n4 = 0x1010;//十六进制

        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        System.out.println("n3=" + n3);
        System.out.println("n4=" + n4);
    }
}