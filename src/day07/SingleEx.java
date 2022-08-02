package day07;

public class SingleEx {
	public static void main(String[] args) {

		Singleton.getInstance();
		System.out.println(Singleton.getInstance());
		//MysqlConn m =  MysqlConn.getInstance();
		//System.out.println(m.mysqlConn());
		
		MysqlConn db1 = MysqlConn.getInstance();
		MysqlConn db2 = MysqlConn.getInstance();
		System.out.println("db1의 객체 :" + db1);
		System.out.println("db2의 객체 :" + db2);
		
		System.out.println("db1의 연결주소 :" + db1.mysqlConn());
		System.out.println("db2의 연결주소 :" + db2.mysqlConn());
		
//		Message msg = new Message();
//		Message msg2 = new Message();
		
		
//		Message m1 = Message.getInstance("hello");
//		Message m2 = Message.getInstance("hoy");
//
//		System.out.println(m1.getMsg());
//		System.out.println(m2.getMsg());
	}
}
