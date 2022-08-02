package day10;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConn {
	private static OracleConn my = new OracleConn();
	private Connection conn;
	private OracleConn() {
		oracleConn();
	}
	public static OracleConn getInstance() {
		return my;
	}

	private void oracleConn(){
		final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//Connection conn= null; 
		try {						
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"joy","cmrikim"); 
			System.out.println("오라클 연결완료");  
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Connection getConn(){
		return conn;
	}
	public static void main(String[] args) {
		OracleConn.getInstance().getConn();
	}
}
