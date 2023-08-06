/*
 * 随机生成10个随机整数（1-100）保存到数组
 * 倒序打印
 * 求平均值、求最大值
 * 查找其中是否有8
 */
public class HomeWork02 {
    public static void main(String[] args) {
        
        int[] arr = new int[10];
        double avg = 0.0;
        int max = arr[0];
        int maxIndex = 0;
        int sum = arr[0];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }

        for(int i = arr.length - 1; i <= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        for(int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if(max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        avg = sum / arr.length;
        System.out.println("max=" + max + ", maxIndex=" + maxIndex);
        System.out.println("avg=" + avg);

        int findNum = 8;
        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            if(findNum == arr[i]) {
                System.out.println("找到数" + findNum + "，下标数=" + i);
                index = i;
            }
        }

        if(index == -1) {
            System.out.println("没找到");
        }



    }
}
