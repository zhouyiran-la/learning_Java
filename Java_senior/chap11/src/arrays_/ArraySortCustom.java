package arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zyr
 * @version 1.0
 */
public class ArraySortCustom {
    public static void main(String[] args) {
        int[] arr = {1, -1, 8, 0, 20};
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                // 从小到大
                return i1 - i2; //return i2 - i1
            }
        });

        System.out.println(Arrays.toString(arr));

    }

    public static void bubble(int[] arr) {
        int temp = 0;
        for(int i=0; i< arr.length - 1;i++) {
            for (int j=0; j < arr.length -i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = arr[j];
                }
            }
        }
    }

    // 冒泡+定制排序
    public static void bubble02(int[] arr, Comparator c) {
        int temp = 0;
        for(int i=0; i< arr.length - 1;i++) {
            for (int j=0; j < arr.length -i - 1; j++) {
                // 从小到大
                if (c.compare(arr[j], arr[j+1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = arr[j];
                }
            }

        }
    }
}
