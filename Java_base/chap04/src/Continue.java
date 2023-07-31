public class Continue {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 4) {
            i++;
            if(i == 2) {
                continue;
            }
            System.out.println("i=" + i);
        }

        label1:
        for(int j = 0; j < 4; j++) {
        // label2:
            for(int k = 0; k < 10; k++) {
                if( k == 3) {
                    continue label1; // 直接跳出最外层循环
                }
                System.out.println("k=" + k);// 输出四次[0 1 2]
            }
        }
    }
}
