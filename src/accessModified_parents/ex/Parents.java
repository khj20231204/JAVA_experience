package accessModified_parents.ex;

public class Parents {
    public int public_var = 1;
    protected  int protected_var = 2;
    int default_var = 3;
    private int private_var = 4;
    Parents(){
        System.out.println("parents default");
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
    public void public_method() {
        System.out.println("parents public_method");
    }
    protected  void protected_method(){
        System.out.println("parents protected_method");
    }
    void default_method(){
        System.out.println("parents default_method");
    }
    private void private_method(){
        System.out.println("parents private_method");
    }
}
