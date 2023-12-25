package polymorphism.ex;

public class B extends A{  //A를 상속 받음

    public B(){
        //System.out.println("class B construct");
    }

    @Override
    public void A_Func() {  //overriding
        System.out.println("A Func in Class B");
    }

    public void B_Func(){  //new make
        System.out.println("B Func");
    }
}
