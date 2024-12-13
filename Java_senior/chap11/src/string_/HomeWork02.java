package string_;

import java.sql.SQLOutput;

/**
 * @author zyr
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        String name = "tom";
        String pwd = "123456";
        String email = "aaaa@sohu.com";
        try {
            userRegister(name, pwd, email);
            System.out.println("恭喜你，注册成功~");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void userRegister(String name, String pwd, String email) {

        if (!(name.length() >= 2 && name.length() <=4)) {
            throw new RuntimeException("用户名长度2~4");
        }
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码必须为6位，要求全是数字");
        }

        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("无效邮箱");
        }

    }

    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }

}
