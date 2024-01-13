package interfaceClassMuti_ch13;

public class TestMain {
    public static void main(String[] args){
        Queue bookQueue = new BookShelf();

        bookQueue.enQueue("magician of oz 1");
        bookQueue.enQueue("magician of oz 2");

        System.out.println(bookQueue.getSize());

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());

        System.out.println(bookQueue.getSize());
    }
}
