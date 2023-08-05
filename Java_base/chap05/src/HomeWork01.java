/*
 * 已知有个升序数组，要求插入一个元素，该数组顺序依然是升序
 * eg.[10, 12, 45, 90]，添加23后，数组为[10, 12, 23, 45, 90]
 */
import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {

        int[] arr = {10, 12, 45, 90};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入要插入的元素：");
        int insertItem = myScanner.nextInt();
        int insertIndex = -1;

        int[] arrNew = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > insertItem) {
                arrNew[i] = insertItem;
                insertIndex = i;
                break;
            }
        }

        if(insertIndex == -1) {
            insertIndex = arr.length;
        }
        
        // 将arr元素拷贝到arrNew并跳过indexItem位置--我的实现
        for(int i = 0; i < arrNew.length; i++) {
            if(i < insertIndex) {
                arrNew[i] = arr[i];
            } else if(i == insertIndex) {
                arrNew[i] = insertItem;
            } else {
                arrNew[i] = arr[i-1];
            }
        }

        // 将arr元素拷贝到arrNew并跳过indexItem位置--改进实现
        // for(int i = 0, j = 0; i < arrNew.length; i++) {
        //     if(i != insertIndex) {
        //         arrNew[i] = arr[j];
        //         j++;
        //     } else {
        //         arrNew[i] = insertItem;
        //     }
        // }

        arr = arrNew;

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        myScanner.close();
     
    }
}
