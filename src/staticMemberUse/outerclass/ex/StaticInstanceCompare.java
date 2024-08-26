package staticMemberUse.outerclass.ex;

//자체변수 선언 과 외부변수 사용
//일반 변수
//static 변수

//자체메소드 선언 과 외부메소드 사용
//일반 메소드
//static 메소드

class GeneralClass{ //일반 클래스
	
	int generalVar = 100; //일반 변수
	static int staticVar = 200; //static 변수
	
	public void generalMethod() { //일반 메소드
		//선언
		int generalVar2 = 300;
		static int staticVar2 = 400;
		
		//사용
		System.out.println(generalVar);
		System.out.println(staticVar);
	}
	
	public static void staticMethod() { //static 메소드
		//선언
		int generalVar2 = 300;
		static int staticVar2 = 500;
		
		//사용
		System.out.println(generalVar);
		System.out.println(staticVar);
		
		GeneralClass gc = new GeneralClass();
		System.out.println(gc.generalVar);
	}
}

static class StaticClass{ //static클래스는 내부 클래스만 가능
	
}



public class StaticInstanceCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		static int a =10;

	}

}
