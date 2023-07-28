import java.util.Scanner;

public class NestedIfExercise {
    public static void main(String[] args) {
        int month;
        int age;
        Scanner myScanner = new Scanner(System.in);
        month = myScanner.nextInt();
        age = myScanner.nextInt();

        if(month >= 4 && month <= 10) {
            if(age < 18) {
                System.out.println("旺季票价为30元");
            } else if(age > 60) {
                System.out.println("旺季票价为20元");
            } else {
                System.out.println("旺季票价为60元");
            } 
        } else {
            if(age >= 18 && age <= 60) {
                System.out.println("淡季票价为40元");
            } else {
                System.out.println("淡季票价为20元");
            }
        }
        myScanner.close();
    }
}
