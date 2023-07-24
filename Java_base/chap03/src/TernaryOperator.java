/*
 * 三元运算符使用
 * 条件表达式为true， 返回前者
 * 条件表达式为false，返回后者
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;

        int result1 = a > b ? a++ : b--;
        System.out.println("result=" + result1);// 99
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        // 表达式1和表达式2要为可以赋给接收变量的类型
        // 或者能够自动转换以及手动强制转换
        int c = 3;
        int d = 8;
        int result2 = c > d ? c : d;
        //int result2 = a > b ? 1.1 : 3.4;错误
        System.out.println("result2=" + result2);

        // 课堂练习，利用三元运算符实现三个数的最大值
        int x = 85;
        int y = 90;
        int z = 42;
        int tmp = x > y ? x : y;
        int max1 = tmp > z ? tmp : z;
        System.out.println("max1=" + max1);

        // 用一条语句实现, 推荐使用上面方法
        int max2 = x > y ? (x > z ? x : z) : (y > z ? y : z);
        int max3 = (x > y ? x : y) > z ? (x > y ? x : y) : z;
        System.out.println("max2=" + max2);
        System.out.println("max3=" + max3);
    }
    
}
