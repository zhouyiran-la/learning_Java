import java.util.Scanner;

public class BreakExercise02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String name = "";
        String passwd = "";
        int chance = 3;
        
        for(int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名");
            name = myScanner.next();
            System.out.println("请输入密码");
            passwd = myScanner.next();
            if("丁真".equals(name) && "666".equals(passwd)) {// 尽量将具体字符串写在前面，避免空指针
                System.out.println("恭喜你，登陆成功~");
                break;
            } else {
                chance--;
                if(chance == 0) {
                    System.out.println("登录失败，请稍后再试~");
                    break;
                }
                System.out.println("你还有" + chance + "次登录机会");         
            }
        }
        myScanner.close();
    } 
}
