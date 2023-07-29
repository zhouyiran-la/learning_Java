public class DoWhileExercise01 {
    public static void main(String[] args) {
        
        // 01 
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        }while(i <= 100);
        System.out.println("sum=" + sum);

        // 02
        i = 1;
        int count = 0;
        do {
            if(i % 5 == 0 && i % 3 !=0){
                count++;
            }
            i++;
        }while(i <= 200);
        System.out.println("count=" + count);
    }
}
