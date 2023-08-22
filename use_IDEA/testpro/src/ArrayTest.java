// import java.util.Scanner;
/*
常用快捷键：
- 复制一行
- 
 */
public class ArrayTest {

    public static void main(String[] args) {
        Mytools tool = new Mytools();
        int[] arr = {10, -1, 8, 0, 34};
        // Alt + Enter 自动导入包
        // Scanner myScanner = new Scanner(System.in);

        tool.bubble(arr);
        // 输出排序后的arr
        tool.print(arr);
    }
}

class Mytools {

    // 冒泡排序
    public void bubble(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
