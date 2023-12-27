package interfaceClassMuti_ch13;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BookShelfTest {
    public static void main(String[] args){
        Queue bookQueue = new BookShelf();

        bookQueue.enQueue("magician of oz 1");
        bookQueue.enQueue("magician of oz 2");
        bookQueue.enQueue("magician of oz 3");
        bookQueue.enQueue("magician of oz 4");

        System.out.println(bookQueue.getSize());

        bookQueue.deQueue();
        bookQueue.deQueue();
        bookQueue.deQueue();

        System.out.println(bookQueue.getSize());
        //main -> 상속 클래스BookShelf의 getSize -> 인터페이스  getCount
        //main에서 BookShelf의 getSize()호출
        //getSize()에서 인터페이스의 getCount()호출
        //shelf클래스의 getCount() return shelf.size() 반환

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println("s1 hashCode : "+System.identityHashCode(s1));
        System.out.println("s2 hashCode : "+System.identityHashCode(s2));

        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2);
        System.out.println("str1 hashCode : "+System.identityHashCode(str1));
        System.out.println("str2 hashCode : "+System.identityHashCode(str2));

        String ss = """
                hei.
                fewjl
                gekljg
                glghl
                
                """;
        System.out.println(ss);
    }
}
