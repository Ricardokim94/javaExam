package day06;

public class StaticEx {
	//�ʵ�
	String str;
	
	//������
	StaticEx(){
		
	}
	
	//static
	
	//instance =>��ü�ʱ�ȭ : ��ü�� �����ɶ����� ȣ��
	{
		str = "�ȳ�";
	}
	
	
	//�޼ҵ�
	public static void main(String[] args) {
		
		StaticEx s =new StaticEx();
		System.out.println(s.str);
		
	}
}
