/*
 * 1. 数组是多个相同类型数据的组合
 * 2. 数组创建后，若没有赋值，会默认分配：
 *    int[0] short[0] byte[0] long[0]
 *    float[0.0] double[0.0] char[\u0000]
 *    boolean[false] String[null]
 * 3. 注意不要越界
 */
public class ArrayDetail {
    public static void main(String[] args) {

        // int[] arr1 = {1, 2, 3, 60, "hello"};错误
        //double[] arr2 = {1.1, 2.2, 3.3, 60.6, 100}; // 正确

        short[] arr3 = new short[3];
        
        for(int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        
    }
}
