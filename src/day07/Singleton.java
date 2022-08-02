package day07;

public class Singleton {

		//싱글톤은 단 하나의 객체만 생성
	//2) 자신의 객체를 생성해서 변수에 담는다(필드에 저장)
	private static Singleton s =new Singleton();
	
	//1) 생성자 호출을 막는다
		private Singleton() {
			
		}
		
		//3)메소드를 만든다 - 자신의 객체 주소를 넘긴다.
		static Singleton getInstance(){
			return s;
		}
		
}
