// 数组扩容
import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1, 2, 3};

        while(true) {

            // 定义新数组
            int[] arrNew = new int[arr.length + 1];
            // 将扩容前数组元素复制到新数组
            for(int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }

            System.out.println("请输入需要添加的元素：");
            int newItem= myScanner.nextInt();

            arrNew[arrNew.length - 1] = newItem;
            // 将新数组地址赋给原数组
            arr = arrNew;
            
            System.out.println("扩容后数组：");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.print('\n');

            System.out.println("添加成功，是否继续？y/n");
            char res = myScanner.next().charAt(0);
            if(res != 'y') {
                break;
            }

        }
        myScanner.close();
    }
}
