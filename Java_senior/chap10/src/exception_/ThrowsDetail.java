package exception_;

import java.io.FileNotFoundException;

/**
 * @author zyr
 * @version 1.0
 */

/*
1. 对于编译异常，程序必须处理
2. 运行时异常默认throws处理方式
3. 子类重写父类方法时，对抛出异常的规定：要么和父类抛出的异常一致，要么为父类抛出异常的子类
 */

public class ThrowsDetail {
    public static void main(String[] args) {

    }

    // f2抛出了编译异常，f1调用f2时必须显式处理编译异常
    // f3抛出了运行时异常，f1调用f3时有默认处理机制，不必显式处理
    public static void f1() throws  FileNotFoundException{
        f2();
        f3();
    }

    public static void f2() throws FileNotFoundException {

    }

    public static void f3() throws ArithmeticException {

    }
}

class Father {
    public void method() throws RuntimeException {

    }
}

class Son extends Father {
    @Override
    public void method() throws NumberFormatException {
        super.method();
    }
}
