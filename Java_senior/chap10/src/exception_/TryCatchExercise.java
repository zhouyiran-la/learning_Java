package exception_;

import java.util.Scanner;

/**
 * @author zyr
 * @version 1.0
 */
public class TryCatchExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while (true) {
            System.out.println("请输入一个整数:");
            try {
                inputStr = scanner.next();
                num = Integer.parseInt(inputStr);
                break;
            }catch (NumberFormatException e) {
                System.out.println("非整数！");
            }

        }
        System.out.println("num=" + num);

    }
}
