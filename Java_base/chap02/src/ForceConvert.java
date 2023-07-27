public class ForceConvert {
    public static void main(String[] args) {
          
        int n1 = (int)1.9;
        System.out.println("n1=" + n1);//1 造成精度损失

        int n2 = 2000;
        byte b1 = (byte)n2;
        System.out.println("b1=" + b1);//-48 造成内存溢出

        //强转符号只对最近的操作数有效，使用小括号提升优先级
        //int x = (int)10*3.5+6*1.5;编译错误：double -> int
        int y = (int)(10*3.5+6*1.5);
        System.out.println(y);//(int)44.0 -> 44

        //char可以保存int常量值，无法保存int变量，需要强转
        char c1 = 100;
        int m = 100;
        //char c2 = m;错误
        char c3 = (char)m;
        System.out.println("c1=" + c1);
        System.out.println("c3=" + c3);
    }
}