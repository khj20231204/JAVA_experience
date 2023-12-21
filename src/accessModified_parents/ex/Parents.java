package accessModified_parents.ex;

public class Parents {
    Parents(){
        System.out.println("parents defalut");
    }

    public Parents(int i){
        System.out.println("parents public");
    }

    protected Parents(String str){
        System.out.println("parents protected");
    }

    private Parents(int i, String str){
        System.out.println("parents private");
    }
}
