/*
 * 位运算
 * & 按位与
 * | 按位或
 * ~ 按位取反
 * ^ 按位异或
 * << 算数左移 >> 算数右移 >>> 逻辑右移 
 */
public class BitOperator01 {
    public static void main(String[] args) {
        //1. 2的补码（与原码一样）
        //2. 3的补码（与原码一样）
        //3. 按位与&
        //4. 补码转原码（与原码一样）
        System.out.println(2&3);//-2
        //1. -2的原码-->补码
        //2. 按位取反（包括符号位）
        //3. 补码转原码
        System.out.println(~-2);//1
        System.out.println(~2);//-3
        System.out.println(2|3);//3
        System.out.println(-2|3);//-1
        System.out.println(2^3);//1
    }
}
