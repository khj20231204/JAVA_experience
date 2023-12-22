package accessModified_child.ex;

public class Main {
    public static void main(String[] arg){
        Child c1 = new Child();
        Child c2 = new Child(5);
        Child c3 = new Child("a");
        Child c4 = new Child(5,"a");
    }
}


