
public class For {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            System.out.println("你好，周依然！" + i);
        }// i作用域为for循环体

        int j = 1;
        for(; j <= 10; j++) {
            System.out.println("你好，周依然！" + j);
        }

        // for(;;) { // 死循环
        //     System.out.println("你好，周依然！");
        // }

        int count = 3;
        for(int i = 0, k = 0; i < count; i++, k += 2) {
            System.out.println("i=" + i + " k=" + k);
        }
    }
}
