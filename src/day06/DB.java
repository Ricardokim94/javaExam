package day06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	//필드
	//Static : 클래스가 메모리로 로딩될때 자동으로 실행된다.
				//new 생성자로 호출하지 않아도 된다.
				//사용이유? 객체마다 공통의 속성값이나 메소드를 정의할때
	static private String url ="jdbc:mysql://localhost/chang";
	
	//메소드
	static Connection mysqlConn(){
		Connection conn= null; //한번만 쓰고 말꺼니까 필드보다는 이 안에 선언하는게 더 낫다
		try {						//그리고 초기화를 해줘야 한다.
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,"root","123123"); 
			System.out.println("mysql 연결완료");  
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
