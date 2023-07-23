public class StringToBasic {
    public static void main(String[] args) {

        //基本数据类型-->String
        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        //String-->基本数据类型, 注意数据必须为有效形式，否则会抛出异常
        String s5 = "123";
        int n2 = Integer.parseInt(s5);
        double d2 = Double.parseDouble(s5);
        float f2 = Integer.parseInt(s5);
        long l1 = Long.parseLong(s5);
        byte by1 = Byte.parseByte(s5);
        boolean b3 = Boolean.parseBoolean("true");
        short sh1 = Short.parseShort(s5);

        System.out.println("===========================");
        System.out.println("n2=" + n2);
        System.out.println("d2=" + d2);
        System.out.println("f2=" + f2);
        System.out.println("l1=" + l1);
        System.out.println("by1=" + by1);
        System.out.println("b3=" + b3);
        System.out.println("sh1=" + sh1);

        //String-->char,利用String.charAt(int index)方法获取字符串中第index个字符（从0开始）
        System.out.println(s5.charAt(0));
        
    }
}
