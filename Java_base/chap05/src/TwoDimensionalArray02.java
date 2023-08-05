public class TwoDimensionalArray02 {
    public static void main(String[] args) {

        // 动态初始化1
        int arr1[][] = new int[2][3];
        arr1[1][1] = 8;

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("======================");

        // 动态初始化2
        int arr2[][];
        arr2 = new int[2][3];

        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("======================");

        /* 动态初始化--列数不确定
         * Java中二维数组第二维可以不同，eg. 动态创建如下二维数组，并输出
         * i = 0：1
         * i = 1: 2 2
         * i = 2: 3 3 3
         */

        int arr3[][] = new int[3][];
        
        for(int i = 0; i < arr3.length; i++) {
            arr3[i] = new int[i + 1];
            for(int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = i;
            }
        }
        
        for(int i = 0; i < arr3.length; i++) {
            for(int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.print("\n");
        }

        
 
    }
}
