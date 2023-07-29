
public class ForExercise {
    public static void main(String[] args) {
        // 01
        int count = 0;
        int sum = 0;

        for(int i = 0; i <= 100; i++) {
            if(i % 9 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("个数：" + count + " 总和：" + sum);

        // 01 更好实现
        // 为适应更普遍的问题，可将问题中常量改为变量
        int start = 1;
        int end = 100;
        int t = 9;
        sum = count = 0;
        for(int i = start; i <= end; i++) {
            if(i % t == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("个数：" + count + " 总和：" + sum);
        
        // 02
        for(int j = 0, k = 5; j < 6; j++, k--) {
            System.out.println(j + " + " + k + " = " + 5);
        }

        //02 更好实现
        int n = 5;
        for(int i = 0; i <= 5; i++) {
            System.out.println(i + " + " + (n - i) + " = " + n);
        }
        
    }
}
