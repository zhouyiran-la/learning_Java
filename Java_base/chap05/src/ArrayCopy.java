public class ArrayCopy {
    public static void main(String[] args) {
        
        // 数组拷贝，独立存储空间
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[arr1.length];

        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        arr2[0] = 100;

        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
