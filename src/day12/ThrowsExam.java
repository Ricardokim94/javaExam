package day12;

public class ThrowsExam {
	public static void main(String[] args) {
		//예외 떠넘기기 : 메소드를 호출한 곳으로 예외를 넘긴다는 것임!
			// 리턴타입 메소드명(매개변수..) throws 예외클래스1, 예외클래스2...{  }
			// 생성자와 메소드 선언부에 throws 키워드를 붙일 수 있으며, 이런 경우 "*"반드시"*"
			// 호출한 곳에서 try-catch 블록으로 예외처리를 해줘야 함.
		
			//만약에 메인으로 떠넘겨 버린다면 main() 메소드에서 throws 사용한 경우
			// JVM이 최종적으로 예외처리하며 콘솔에 예외내용을 출력
			// ==> 권장하지 X ==> try-catch문을 사용
		
		//예외강제발생 : throw new Exception생성자호출;	 
		
		
		try {
			method1();
			System.out.println("실행됩니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
			System.out.println(e.getMessage());
		}
		try {
			method2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	public static void method1() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
	

	public static void method2() throws Exception {
		System.out.println("메소드2 실행");
		throw new Exception("예외발생");
	}
}















