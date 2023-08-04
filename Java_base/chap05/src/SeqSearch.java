import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {

        String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
        Scanner myScanner = new Scanner(System.in);
        int index = -1;

        System.out.println("请输入要查找的名字：");
        String findName = myScanner.next();
        
        for(int i = 0; i < names.length; i++) {
            if(findName.equals(names[i])) {
                index = i;
                System.out.println("恭喜你找到" + findName + "，下标为" + i);
                break;
            }
        }

        if(index == -1) {
            System.out.println("查无此人");
        }

        myScanner.close();

    }
}
