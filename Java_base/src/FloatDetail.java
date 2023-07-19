/*
 * Java浮点类型
 * float[4]
 * double[8]
 */
public class FloatDetail {
    public static void main(String[] args) {
        //Java浮点型常量默认为double型，声明float型常量要加'f'或'F'
        final double a = 1.1;
        //final float b = 1.1; 不正确
        final double c = 1.1;
        final float d = 1.1F;
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        //科学计数法
        System.out.println(7.07e2);
        System.out.println(7.07e-2);

        //浮点数使用陷阱
        double num1 = 2.7;
        double num2 = 2.7;
        double num3 = 8.1 / 3;

        //一个经过运算得到的浮点数与原值有精度损失，无法直接判定相等
        if(Math.abs(num1 - num3) < 1.0e-6) {
            System.out.println("相等");
        }
        //可以判定相等
         if(num1 == num2) {
            System.out.println("相等");
            
        }
    }
}
