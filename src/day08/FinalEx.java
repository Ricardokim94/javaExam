package day08;

import java.sql.Connection;

import day07.MysqlConn;

public class FinalEx {
	//�ʵ� 
	static final double PI = 3.14;
	
	public static void main(String[] args) {
	//final�� Ŭ����/�ʵ�/�޼ҵ� �տ� ���� �� ����.
	//final�� �ʱⰪ�� �����Ǹ� ����Ұ�.
	//�ʱⰪ ������� = �ʵ弱��� �Բ� ���� �Ҵ� or ������ȣ��� �Ű������޾Ƽ�	
	//final ������Ÿ�� �ʵ�� ==> �������� ���� == ��ü���� ����ȴ�.
		//��ǥ���� Ex) String
		Connection conn = MysqlConn.getInstance().mysqlConn();
		System.out.println(conn);

		//static�ȿ��� Ŭ���� ȣ�� ���ϱ⶧����
		//������ ȣ���ϰ� �ҷ��´� (default�����Ǿ� ����)
	FinalEx f = new FinalEx();
	
	String str = null;
	
	System.out.println(f.PI);
	
	//static final ==> ��� ==> �޼ҵ� ���� �޸𸮿� ����ȴ�.
	//�Һ��� ��, ���������� �빮�ڷ� �ۼ�.
	//�ʱⰪ ���� : static { �ʱⰪ ���� }�� �ϸ�ȴ�.
		
	
	
	
	}
}












