// 遍历一个数组， 输出数组的各个元素值
public class Method02 {
    public static void main(String[] args) {

        MyTools tool = new MyTools();
        int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};
        // 提高代码复用性
        tool.PrintArr(map);
        System.out.println("==========");
        tool.PrintArr(map);
    }
    
}

class MyTools {

    public void PrintArr(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public Person copyPerson(Person p) {
        Person newPerson = new Person();
        newPerson.age = p.age;
        newPerson.name = p.name;
        return newPerson;
    }

}
 