public class MethodParameter02 {
    public static void main(String[] args) {

        // B类--MethodDetail02.java
        B b = new B();
        int[] arr = {1, 2, 3};
        // 引用类型传递的是地址(传递也是值，但值是地址)
        b.test100(arr);

        System.out.println("main方法arr数组：");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Person类--PropertiesDetail.java
        Person p = new Person();
        p.age = 10;
        p.name = "小明";
        // test200会将p->null, 但改变的仅是test200方法中局部变量p，对主栈中的p变量不会有任何影响
        b.test200(p);

        System.out.println("p.age=" + p.age);// 10
    }
}
