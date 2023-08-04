/*
 * 数组缩减
 * 数组内部只剩一个元素时，提示无法缩减
 */

import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        Scanner myScanner = new Scanner(System.in);
        char res;
        do {
            if(arr.length == 1) {
                System.out.println("无法缩减");
                break;
            }
    
            int[] arrNew = new int[arr.length  - 1];
            for(int i = 0; i < arrNew.length; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;

            System.out.println("缩减后数组：");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.print('\n');

            System.out.println("是否要继续缩减？y/n");
            res = myScanner.next().charAt(0);

        }while(res != 'n');
        myScanner.close();
            
    }
}
