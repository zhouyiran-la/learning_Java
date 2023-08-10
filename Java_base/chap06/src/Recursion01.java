/*
 * 递归执行机制
 * (1) 调用一次方法，就创建一个新的栈空间
 * (2) 方法中局部变量彼此独立，引用类型变量共享数据
 * (3) 递归必须向退出递归条件逼近
 * (4) 谁调用返回给谁
 */


public class Recursion01 {

    public static void main(String[] args) {

        RecursionTools obj = new RecursionTools();
        obj.test01(4);// n=2 n=3 n =4
        obj.test02(4);// n=2r

        // 计算阶乘
        int res1 = obj.factorial(5);
        System.out.println("5!=" + res1);

        // 计算斐波那契数列
        int res2 = obj.fibonacci(10);
        if(res2 != -1) {
            System.out.println("fibonacci(10)=" + res2);
        }

        // 猴子吃桃
        int res3 = obj.monkeyEatPeach(1);
        if(res3 != -1) {
            System.out.println("最初有" + res3 + "个桃子");
        }
        
        
    }
}
