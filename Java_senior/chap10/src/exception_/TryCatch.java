package exception_;

/**
 * @author zyr
 * @version 1.0
 */

/*
*  1. 若捕获多个异常 子类异常写在前面 父类异常写在后面
*
*
* */
public class TryCatch {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            System.out.println(person.getName());
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;
        } catch (NullPointerException e) {
            System.out.println("空指针异常=" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("算术异常=" + e.getMessage());
        } finally {
            System.out.println("finally 被执行  ");
        }
    }
}

class Person{
    private String name = "jack";
    public String getName() {
        return name;
    }
}
