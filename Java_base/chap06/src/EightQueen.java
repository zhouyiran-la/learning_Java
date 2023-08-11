//在8×8格的国际象棋上摆放八个皇后，使其不能互相攻击，即任意两个皇后都不能处于同一行、同一列或同一斜线上，问一共有多少种摆法？

public class EightQueen {
    public static void main(String[] args) {

        int[] arr = new int[8];
        Queen8 obj = new Queen8();
        obj.PutQueen(arr, 0);
    }
}

class Queen8 {

    int count = 0;

    /**
     * PutQueen方法利用递归思想求解所有摆放结果.
     * 1. 第1个皇后放在第1行第1列.
     * 2. 第2个皇后摆放在第2行第1 ... 8列，若该位置不冲突则递归摆放下一个皇后，若冲突则继续遍历.
     * 3. 当8个皇后全都放置完后打印当前解并返回，之后回溯到上一调用方法中继续求解. 直至找到将第1个
     *    皇后摆放在第1行第1列的所有正确解.
     * 4. 第1个皇后放在第1行第2(3 ... 8)列，重复2, 3步骤至找到全部解.
     * 
     * @param arr 当前摆放结果
     * @param n 当前摆放第n(+1)个皇后
     */

    public void PutQueen(int[] arr, int n) {
        if(n == 8) {
            count++;
            print(arr);
            return;
        }
        for(int i = 0; i < 8; i++) {
            arr[n] = i;
            if(isOk(arr, n)) {
                PutQueen(arr, n + 1);
            } 
        }
    }

    
    // 判断方法--我的实现
    // public boolean isOK(int[] arr, int n) {
    //     for(int i = 0; i <= n; i++) {
    //         for(int j = 1; j + i <= n; j++) {
    //             if(arr[i] == arr[j + i] || Math.abs(arr[i] - arr[j+i]) == j) {
    //                 return false;
    //             }
    //         }
    //     }

    //     return true;
    // }



    // 判断方法--改进实现（无需全局遍历）
    /**
     * isOk方法用于判断当前皇后摆放位置是否会引起冲突.
     * 1. 判断当前所有皇后是否在同一行（数组index代表行索引，该条件自动满足无需判断）.
     * 2. 判断当前所有皇后是否在同一列，相当于判断新加入的皇后与之前各皇后是否在同一列.
     * 3. 判断当前所有皇后是否在同一之前，相当于判断新加入的皇后与之前各皇后是否在同一直线，即判断两个皇后的列索引之差的绝对值与其行索引之差的绝对值是否相等.
     * 
     * @param arr 当前摆放结果
     * @param n 当前摆放第n(+1)个皇后
     * @return 复合条件返回true，否则返回false.
     */

    public boolean isOk(int[] arr, int n) {

        for(int i = 0; i < n; i++) {
            if(arr[i] == arr[n] || Math.abs(arr[i] - arr[n]) == Math.abs(i - n)) {
                return false;
            }       
        }
        return true;
    }

    
    public void print(int[] arr) {
        System.out.print(count + ": ");
        for(int i = 0; i < 8; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
