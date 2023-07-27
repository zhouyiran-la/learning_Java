public class IfExercise01 {
    public static void main(String[] args) {
        // 01
        Double d1 = 20.0;
        Double d2 = 50.0;
        if(d1 > 10.0 && d2 < 20.0) {
            System.out.println("两数之和=" + (d1 + d2));
        }

        //02
        int n1 = 5;
        int n2 = 8;
        int sum = n1 + n2;
        if((sum) % 3 == 0 && (sum) % 5 == 0) {
            System.out.println("ok!");
        } else {
            System.out.println("no!");
        }

        //03
        int year = 2006;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年。");
        } else {
            System.out.println(year + "不是闰年。");
        }


    }
}
