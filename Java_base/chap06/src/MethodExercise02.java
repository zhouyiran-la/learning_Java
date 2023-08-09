/*
 * 在MyTools类中添加copyPerson方法：
 * 要求可以复制一个Person对象，返回复制的对象。
 * 注意新对象和原对象彼此独立，只是属性相同
 */

public class MethodExercise02 {
    public static void main(String[] args) {

        Person p = new Person();
        p.age = 10;
        p.name = "milan";
        MyTools tools = new MyTools();
        Person newPerson = tools.copyPerson(p);

        System.out.println("p的属性：age=" + p.age + " name=" + p.name);
        System.out.println("newPerson的属性：age=" + newPerson.age + " name=" + newPerson.name);

        // 通过比较量对象的Hash值来判断两者是否是同一个对象
        System.out.println("p：" + p.hashCode());
        System.out.println("newPerson：" + newPerson.hashCode());
    }
}
