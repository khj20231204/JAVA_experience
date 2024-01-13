package accessModified_child.ex;
import accessModified_parents.ex.Parents;

class Child extends Parents{
    Child(){
        //super(); default라서 error발생
        super(1);
        System.out.println("child");

        int p1 = this.public_var;
        int p2 = this.protected_var;
        //int p3 = this.default_var;
        //int p4 =- this.private_var;

        this.public_method();
        this.protected_method();
        //this.default_method();
        //this.private_method();
    }
    public Child(int i) {
        super(i);  //parents - public
    }
    public Child(String str){
        super(str);  //parents - protected
    }
    public Child(int i, String str){
        super("null");
        //super(i, str); private라서 error 발생
    }
}

