package day07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConn {

	private static MysqlConn my = new MysqlConn();
	private Connection Conn;
	
	private MysqlConn() {
	}
	
	public static MysqlConn getInstance() {
		return my;
	}
	

	public Connection mysqlConn(){
		final String url = "jdbc:mysql://localhost/chang";
		//Connection conn= null; 
		try {						
			Class.forName("com.mysql.jdbc.Driver");
			Conn = DriverManager.getConnection(url,"root","123123"); 
			System.out.println("mysql 연결완료");  
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return Conn;
	}
}
