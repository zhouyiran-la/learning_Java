/* 
 * Java数组赋值机制
 * 基本数据类型赋值为值传递(深拷贝)
 * 引用数据类型（数组、字符串、类、对象等）为地址传递(浅拷贝)
 */

public class ArrayAssign {
    public static void main(String[] args) {
       
        int n1 = 10;
        // 深拷贝
        int n2 = n1;
        
        n2 = 80;
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);

        int[] arr1 = {1, 2, 3};
        // 浅拷贝
        int[] arr2 = arr1;
        arr2[0] = 10;

        System.out.println("arr1:");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\n");
        System.out.println("arr2:");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        
    }

    
}
