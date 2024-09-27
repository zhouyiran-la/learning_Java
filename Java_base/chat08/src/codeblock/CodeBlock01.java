package codeblock;

// 1. 代码块相当于另外一种形式的构造器，可以做初始化操作
// 2. 如果多个构造器中都有构造语句，可以抽取到初始化块中

public class CodeBlock01 {
    public static void main(String[] args) {
        new Movie("1111");
        new Movie("1111", 12.00);
        new Movie("1111", 12.00, "张艺谋");

    }
}

class Movie {
    private String name;
    private double price;
    private String director;
    // 代码块
    // 不管调用那个构造器都会先调用代码块的内容
    // 提高代码复用率
    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
    }
    public Movie(String name) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影正式开始...");
        this.name = name;
    }

    public Movie(String name, double price, String director) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影正式开始...");
        this.name = name;
        this.price = price;
        this.director = director;
    }

    public Movie(String name, double price) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影正式开始...");
        this.name = name;
        this.price = price;
    }
}