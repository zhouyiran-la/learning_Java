// 数组元素翻转
public class ArrayReverse {
    public static void main(String[] args) {
        
        int[] arr = {66, 55, 44, 33, 22, 11};

        // 方法一
        int tmp;
        for(int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        System.out.print("翻转后数组：");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

        // 方法二
        int[] arr2 = new int[arr.length];
        for(int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            arr2[i] = arr[j];
        }

        //arr与arr2指向同一块内存空间，原来arr的数据空间被JVM自动回收
        arr = arr2;

        System.out.print("翻转后数组：");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
       
        System.out.print("\n");
    }
}