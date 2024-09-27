package final_;
/*
    1. final修饰属性又叫常量，通常用XX_XX来命名
    2. final属性在定义时，必须赋初值，并且不能修改，赋值操作可以在：
     1）定义时
     2）在构造器中
     3）在代码块中
    3. 若final属性时静态的，则只能在以下位置赋值，不能在构造器赋值
     1）定义时
     2）静态代码块
    4. final类不可被继承但可以被实例化
    5. 含有final方法的类不能重写该方法，但可以被继承
    6. 一般来说，如果类是final类，其方法没有必要再定义成final方法
    7. final不能修饰构造方法
    8. final和static往往搭配使用，这样不会导致类加载，效率更高
    9. 包装类 （Integer、String、Float等）是final类，不能被继承
 */
public class FinalDetail01 {
}

class AA {
    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;
    public AA() {
        TAX_RATE2 = 1.1;
    }
    {
        TAX_RATE3 = 8.8;
    }
}

class BB {
    // 静态变量在类加载时触发，构造器在创建对象时触发
    public static final double TAX_RATE = 0.08;
    public static final double TAX_RATE2 = 1.1;
    public static final double TAX_RATE3;
//    public BB() {
//        TAX_RATE2 = 1.1;
//    }
    static {
        TAX_RATE3 = 8.8;
    }
}