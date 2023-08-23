// import java.util.Scanner;
/*
常用快捷键：
- 复制一行：Ctrl + L
- 删除一行：Ctrl + D
- 删除至行尾：Shift + Delete
- 删除至行首：Alt + Delete
- 格式化代码：Ctrl + Alt + L
- 运行程序：Alt + R
- 生成构造方法：Alt + insert
- 查看类的继承关系：Ctrl + H
- 查看方法定义：Ctrl + B
- 自动导包：Alt + Enter
- 自动分配变量名：.var
 */
public class ArrayTest {

    public static void main(String[] args) {

        Mytools tool = new Mytools();
        int[] arr = {10, -1, 8, 0, 34};

//         Alt + Enter 自动导入包
//         Scanner myScanner = new Scanner(System.in);
//        .var自动分配变量名
//        Scanner scanner = new Scanner(System.in);
//        Scanner scanner1 = new Scanner(System.in);
//        Scanner scanner2 = new Scanner(System.in);

        tool.bubble(arr);
        // 输出排序后的arr
        tool.print(arr);
    }
}

class Mytools {

    // 冒泡排序
    public void bubble(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
