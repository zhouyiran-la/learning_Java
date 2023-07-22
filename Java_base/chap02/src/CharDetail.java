//char[2]
public class CharDetail {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '周'; //可以存放汉字
        char c4 = 97;
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3); 
        System.out.println((int)c3);//21608 对应Unicode编码
        System.out.println(c4); //a     
    }

}
