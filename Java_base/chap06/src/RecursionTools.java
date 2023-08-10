// 递归执行机制
class RecursionTools {

    // 仔细体会test01与test02区别
    public void test01(int n) {
        if(n > 2) {
            test01(n - 1);
        }
        System.out.println("n=" + n);
    }

    public void test02(int n) {
        if(n > 2) {
            test02(n - 1);
        } else {
            System.out.println("n=" + n);
        }  
    }

    //阶乘的递归实现
    public int factorial(int n) {

        if(n == 1) {
            return 1;
        } else {
            return factorial(n-1) * n;
        }
    }

    // 斐波那契数列递归实现
    public int fibonacci(int n) {
        if(n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n-2);
            } 
        } else {
            return -1;
        }
        
    }

    // 猴子吃桃问题
    public int monkeyEatPeach(int day) {
        
        if(day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (monkeyEatPeach(day + 1) + 1) * 2;
        } else {
            return -1;
        }
    }
}
