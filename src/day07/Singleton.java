package day07;

public class Singleton {

		//�̱����� �� �ϳ��� ��ü�� ����
	//2) �ڽ��� ��ü�� �����ؼ� ������ ��´�(�ʵ忡 ����)
	private static Singleton s =new Singleton();
	
	//1) ������ ȣ���� ���´�
		private Singleton() {
			
		}
		
		//3)�޼ҵ带 ����� - �ڽ��� ��ü �ּҸ� �ѱ��.
		static Singleton getInstance(){
			return s;
		}
		
}
