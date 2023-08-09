/*
 * AA类--MethodDetail01.java
 * (1) 添加成员方法，判断是偶数还是奇数
 * (2) 根据行、列、字符打印对应行和列数的字符
 */

public class MethodExercise {
    public static void main(String[] args) {

        AA a = new AA();
        if(a.isOdd(1)) {
            System.out.println("是奇数");
        } else {
            System.out.println("是偶数");
        }

        a.print(4, 4, '#');

    }
}
