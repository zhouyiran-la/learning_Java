package string_;

import java.util.Scanner;

/**
 * @author zyr
 * @version 1.0
 */
public class StringBufferExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String price = "123456.87";
        StringBuffer sb = new StringBuffer(price);
//        int i = sb.lastIndexOf(".");
        for (int i = sb.lastIndexOf(".") -3 ; i > 0;i-=3) {
            sb = sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}
