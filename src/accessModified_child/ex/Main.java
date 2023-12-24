package accessModified_child.ex;

import accessModified_parents.ex.Parents;

public class Main {
    public static void main(String[] arg){
        Child c1 = new Child();
        Child c2 = new Child(5);
        Child c3 = new Child("a");
        Child c4 = new Child(5,"a");

        Parents p1 = new Parents(5);
        System.out.println(c1 == p1);

        if(c1.equals(p1)){
            System.out.println("df");
        }
    }
}


