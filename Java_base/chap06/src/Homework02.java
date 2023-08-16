public class Homework02 {
    public static void main(String[] args) {

        Book book1 = new Book("笑傲江湖", 150);
        book1.info();
        book1.updatePrice();
        book1.info();
    }
    
}

class Book {

    int price;
    String name;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void updatePrice() {
        if(this.price > 150) {
            this.price = 150;
        } else if(this.price > 100) {
            this.price = 100; 
        }
        
    }

    public void info() {
        System.out.println("书名=" + this.name + " 价格=" + this.price);
    }
}
