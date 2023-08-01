/*
 * 数组的使用
 * 1) 动态初始化1：数据类型 数组名[] = new 数据类型[大小]
 *                数据类型[] 数组名 = new 数据类型[大小]
 * eg. int a[] = new int[5] / int[] a = new int[5]
 * 2) 动态初始化2：数据类型 数组名[]; 或者 数据类型[] 数组名;
 *                数组名 = new 数据类型[大小];
 * eg. int a[]; a = new int[5];
 *     int[] a; a = new int[5];
 * 
 */
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        double[] scores = new double[5];

        for(int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i+1) + "个元素值：");
            scores[i] = myScanner.nextDouble();
        }

        for(int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        myScanner.close();
    }
}
