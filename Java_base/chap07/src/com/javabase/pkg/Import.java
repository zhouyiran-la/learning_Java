// 声明当前类所在包，该条语句必须放在文件顶部
package com.javabase.pkg;

// 单独导入java.util包下的Scanner类（建议）
// import java.util.Scanner;
// 导入java.util包下所有类
// import java.util.*;

// import语句放在package语句下面，定义在类之前可以多条且无顺序要求
import java.util.Arrays;

/*
使用系统自带Arrays完成数组排序
 */
public class Import {
    public static void main(String[] args) {

        int[] arr = {-1, 20, 2, 13, 3};
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
