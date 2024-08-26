package innerclass.ex;

class AAA{
	int i = 100;
	BBB b = new BBB();
	
	class BBB{	//BBB클래스는 AAA클래스의 멤버처럼 다루어진다
		void method() {
			//AAA a = new AAA();
			//System.out.println(a.i);
			System.out.println(i);	//객체 생성없이 외부 클래스의 멤버 접근 가능
		}
	}
}


class CCC{
	//BBB b = new BBB(); 내부 클래스는 외부 클래스를 생성한 이후에 생성 가능
	
}

public class InnerTest {

	public static void main(String[] args) {
		//BBB b = new BBB(); BBB클래스는 AAA클래스를 생성한 이후에 접근 가능
	}

}
