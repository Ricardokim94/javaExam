package day08;

import java.sql.Connection;

import day07.MysqlConn;

public class FinalEx {
	//필드 
	static final double PI = 3.14;
	
	public static void main(String[] args) {
	//final은 클래스/필드/메소드 앞에 붙일 수 있음.
	//final은 초기값이 설정되면 변경불가.
	//초기값 설정방법 = 필드선언과 함께 값을 할당 or 생성자호출시 매개변수받아서	
	//final 데이터타입 필드명 ==> 힙영역에 적재 == 객체마다 저장된다.
		//대표적인 Ex) String
		Connection conn = MysqlConn.getInstance().mysqlConn();
		System.out.println(conn);

		//static안에서 클래스 호출 못하기때문에
		//생성자 호출하고 불러온다 (default생략되어 있음)
	FinalEx f = new FinalEx();
	
	String str = null;
	
	System.out.println(f.PI);
	
	//static final ==> 상수 ==> 메소드 영역 메모리에 적재된다.
	//불변의 값, 관례적으로 대문자로 작성.
	//초기값 설정 : static { 초기값 설정 }에 하면된다.
		
	
	
	
	}
}












