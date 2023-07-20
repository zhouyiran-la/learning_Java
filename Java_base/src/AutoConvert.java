/*
 * 常用数据类型转换规则（精度由低到高）
 * char-->int-->long-->float-->double
 * byte-->short-->int-->long-->float-->double
 */

public class AutoConvert {
    public static void main(String[] args) {
        int a = 'c';//正确
        double d = 80;//正确

        System.out.println(a);
        System.out.println(d);

        /*
         * int n1 = 10;
         * float d1 = n1 + 1.1; 错误，double-->float无法转换 
        */
        int n1 = 10;
        double d1 = n1 + 1.1; //正确
        double d2 = n1 + 1.1F; //正确
        System.out.println(d1);
        System.out.println(d2);

        /* 
         * byte b1 = 10;
         * int n2 = 1;
         * byte b2 = n2; 错误，变量赋值类型不符
         * (byte, short)和char之间不会自动转换
         * char c1 = b1; 错误
        */

        //byte, short, char之间可以相互参与计算， 但计算值默认为int类型
        byte b2 = 1;
        short s1 = 1;
        //short s2 = b2 + s1; 错误
        int s3 = b2 + s1; //正确
        System.out.println(s3);
    
        /*
         * boolean不参与类型自动转换
         * boolean pass = true;
         * int tmp = pass; 错误
        */

        



    }
}
