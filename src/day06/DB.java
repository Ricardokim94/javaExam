package day06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	//�ʵ�
	//Static : Ŭ������ �޸𸮷� �ε��ɶ� �ڵ����� ����ȴ�.
				//new �����ڷ� ȣ������ �ʾƵ� �ȴ�.
				//�������? ��ü���� ������ �Ӽ����̳� �޼ҵ带 �����Ҷ�
	static private String url ="jdbc:mysql://localhost/chang";
	
	//�޼ҵ�
	static Connection mysqlConn(){
		Connection conn= null; //�ѹ��� ���� �����ϱ� �ʵ庸�ٴ� �� �ȿ� �����ϴ°� �� ����
		try {						//�׸��� �ʱ�ȭ�� ����� �Ѵ�.
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,"root","123123"); 
			System.out.println("mysql ����Ϸ�");  
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
