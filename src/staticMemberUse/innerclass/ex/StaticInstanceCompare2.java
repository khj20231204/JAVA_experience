package staticMemberUse.innerclass.ex;

//일반 클래스
//static 클래스

//자체변수 선언 과 외부변수 사용
//일반 변수
//static 변수

//자체메소드 선언 과 외부메소드 사용
//일반 메소드
//static 메소드

class GeneralClass2{ //일반 클래스

	int generalVar = 100; //일반 변수
	static int staticVar = 200; //static 변수
	
	class InnerGeneralClass{ //내부 일반 클래스

		public void generalMethod() { // 내부 일반 메소드
			//선언
			int generalVar2 = 300;
			//static int staticVar2 = 400; error
			
			//사용
			System.out.println(generalVar);
			System.out.println(staticVar);
		}
		
		public static void staticMethod() { //static 메소드
			//선언
			int generalVar2 = 300;
			//static int staticVar2 = 500; error
			
			//사용
			//System.out.println(generalVar);
			System.out.println(staticVar);
			
			GeneralClass2 gc = new GeneralClass2();
			System.out.println(gc.generalVar);
		}
	}	
	
	static class InnerStaticClass{ //static 클래스
		public void generalMethod() { //일반 메소드
			//선언
			int generalVar2 = 300;
			//static int staticVar2 = 500; error
			
			//사용
			//System.out.println(generalVar); error
			System.out.println(staticVar);
		}
		
		public static void staticMethod() { //static 메소드
			//선언
			int generalVar2 = 300;
			//static int staticVar2 = 500;
			
			//사용
			//System.out.println(generalVar); error
			System.out.println(staticVar);
			
			GeneralClass2 gc = new GeneralClass2();
			System.out.println(gc.generalVar);
		}
	}
	
	void classUseMethod() {
		InnerGeneralClass igc = new InnerGeneralClass();
		
		InnerStaticClass isc = new InnerStaticClass();
		
		class aaa{
			static int bbb = 400;
		}
	}
}


public class StaticInstanceCompare2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
