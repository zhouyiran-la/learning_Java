/*
 * 算数右移 >>:低位溢出，符号位不变，高位补符号位
 * 算数左移 <<：符号位不变，低位补0
 * >>> 逻辑右移（无符号右移）：低位溢出，高位补0
 * 没有 <<< 符号
 */
public class BitOperator02 {

    public static void main(String[] args) {
        int a = 1 >> 2;//本质为连续除2
        int b = 1 << 2;//本质为连续乘2
        int c = -1 >> 2;
        int d = -1 << 2;
        int e = 3 >>> 2;
        System.out.println(a);//0
        System.out.println(b);//4
        System.out.println(c);//-1
        System.out.println(d);//-4
        System.out.println(e);//0
        System.out.println(4 << 3);//32
        System.out.println(15 >> 2);//3
    }


} 
