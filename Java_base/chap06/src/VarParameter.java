/**
 * 可变参数
 * - 概念: 将同一个类中多个同名同功能但参数个数不同（参数类型一样）的方法，封装成一个方法.
 * - 基本语法: 访问修饰符 返回类型 方法名(数据类型... 形参名).
 */

public class VarParameter {
    public static void main(String[] args) {

        VarParameterMethod obj = new VarParameterMethod();
        System.out.println(obj.sum(1, 8, 56, 96, 52));
    }
}

class VarParameterMethod {

    // public int sum(int n1, int n2) {
    //     return n1 + n2;
    // }
    // public int sum(int n1, int n2, int n3) {
    //     return n1 + n2 + n3;
    // }
    // public int sum(int n1, int n2, int n3, int n4) {
    //     return n1 + n2 + n3 + n4;
    // }

    /**
     * 可变参数使用
     * 1. int... 表示可变参数.
     * 2. 使用可变参数可以党组数组来使用.
     * @param nums
     * @return 所有参数和
     */

    public int sum(int... nums) {

        int sum = 0;
        System.out.println("接受参数的个数："  + nums.length);
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}


