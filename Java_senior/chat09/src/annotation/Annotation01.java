package annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyr
 * @version 1.0
 */

/*
 * @Override  语法校验 加该注解编译器就会检查是否构成重写
 * @Deprecated 某个程序元素 可以修饰方法、类、字段、包、参数等等
 * @SuppressWarnings 抑制编译器警告 all boxing cast dep-ann deprecation等
 * 作用范围和放置位置有关
 */
public class Annotation01 {
    @SuppressWarnings({"rawtypes", "unchecked", "unused"})
    public static void main(String[] args) {
        A a = new A();
        a.hi();

        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
    }
}

// 不推荐使用，但是仍然可以使用
@Deprecated
class A {
    @Deprecated
    public int n1 = 10;

    @Deprecated
    public void hi() {

    }
}
