package single;

/*
* 单例设计模式--饿汉式
* 1. 构造器私有化
* 2. 类的内部创建对象
* 3. 向外暴露一个静态的公共方法
*
* */

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
    }
}

class GirlFriend {
     private  String name;

     private static GirlFriend gf = new GirlFriend("小红");

     private GirlFriend(String name) {

     }
     public static GirlFriend getInstance() {
         return gf;
     }


}