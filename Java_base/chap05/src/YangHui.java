public class YangHui {
    public static void main(String[] args) {

        int arr[][] = new int[10][];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1];
            // 以下代码多余
            // if(i == 0) {
            //     arr[i][0] = 1;
            //     continue;
            // }
            // if(i == 1) {
            //     arr[i][0] = arr[i][1] = 1;
            //     continue;
            // }
            for(int j = 0; j < arr[i].length; j++) {
                if(j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }
        System.out.println("10行杨辉三角：");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }


    } 
}
