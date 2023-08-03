// 创建一个char类型数组，存储'A'-'Z'，使用for循环访问所有元素并打印出来

public class ArrayExercise01 {
    public static void main(String[] args) {
        
        char[] arr = new char[26];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (char)('A' + i);
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}