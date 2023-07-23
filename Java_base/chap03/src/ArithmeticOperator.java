/*
 * 演示算数运算符的使用
 * 重点练习/ % ++
 */

public class ArithmeticOperator {
    public static void main(String[] args) {
        // /
        System.out.println(10 / 4);//2
        System.out.println(10.0 / 4);//2.5
        double d = 10 / 4;
        System.out.println(d);//2.0
        
        // /
        /*
         * % 本质为 a = nq + r  = n * (a / n) + r
         * 由此推出r = a % n  = a - (a / n) * n
         * a / n 的计算结果与编程语言相关，Java采用向零取整
         */

        System.out.println(10 % 3);// 1
        System.out.println(-10 % 3);// -1
        System.out.println(10 % -3);// 1
        System.out.println(-10 % -3); //-1

        // ++
        /*
         * 作为语句独立使用
         * 作为表达式使用
         * ++i：先自增后赋值
         * i++：先赋值后自增
         */
        int i = 10;
        i++; 
        ++i;
        System.out.println(i);//12

        int j = 8;
        int k = ++j; //等价 j = j + 1; k = j;
        System.out.println(k); // 9
        int m = j++; //等价 m = j; j = j + 1;
        System.out.println(m); // 9


    }
}
