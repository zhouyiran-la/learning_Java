/*
 * 成员方法注意事项和使用细节
 * (1) 访问修饰符：public, protected, 默认, private
 * (2) 返回类型
 *    - 一个方法最多有一个返回值(利用数组返回多个结果)
 *    -  返回类型可以为任意类型
 *    - 有返回类型必须要有return值(void 可以没有)
 *    - 驼峰命名法
 * (3) 实参形参数据类型要兼容，个数顺序必须一致
 * (4) 方法不能嵌套定义（有别于Python）
 */

public class MethodDetail01 {
    public static void main(String[] args) {

        AA a = new AA();
        int[] res = a.getSumAndSub(1, 4);
        System.out.println("和=" + res[0]);
        System.out.println("差=" + res[1]);

    }
    
}

class AA {

    // 利用数组返回多个结果
    public int[] getSumAndSub(int n1, int n2) {

        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

    // 不被允许
    // public int f1() {
    //     double d1 = 1.1 * 3;
    //     int n = 100;
    //     return d1;
    // }

    // 不被允许
    // public void f2() {
    //     public void f3() {

    //     }
    // }
}
