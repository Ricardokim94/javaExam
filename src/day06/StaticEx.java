package day06;

public class StaticEx {
	//필드
	String str;
	
	//생성자
	StaticEx(){
		
	}
	
	//static
	
	//instance =>객체초기화 : 객체가 생성될때마다 호출
	{
		str = "안녕";
	}
	
	
	//메소드
	public static void main(String[] args) {
		
		StaticEx s =new StaticEx();
		System.out.println(s.str);
		
	}
}
