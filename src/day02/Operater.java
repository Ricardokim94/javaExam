package day02;

public class Operater {
	public static void main(String[] args) {
		int a, b, c =5;
		a =b =c;
		System.out.println("a:" + a + "\nb:" +b);
	
	a += 1; //a = a+1 (a�� ���������� ���� +1�� �Ѵٴ� ����)
	System.out.println(a);

	a %= 2; //�������� ���϶�� �Ҹ���
	System.out.println(a); 
	
	//a++ ==> �ڿ� �ִ� �ſ� +1�϶�� �Ҹ���
	System.out.println(a++);
	//++a �� �������Ŀ� �ϴ°Ŷ� 1�̳��´�
	System.out.println(a);
	System.out.println(a++ + --b*2);
	
	//������
	int num = 3%1;
	System.out.println(num);
	
	
	//���ڿ� ���� : +
	System.out.println(10 + 9 + "�ڷγ�");
	System.out.println("�ڷγ�" + 10 + 9);
	System.out.println(10 + 9 +"�ڷγ�" + 10 * 9);
	

	//�񱳿�����
	if(1 != 2 && 3 < 4) {
	System.out.println("��������");	
	}
	
	int bit =3;
	bit <<= 2;
	System.out.println(bit);
	
	//���ڿ� ��
	String str1 ="ȫ�浿";			//���Ǯ�� ���� �ȴ� ����
	String str4 ="ȫ�浿";
	
	
	String str2 =new String("ȫ�浿"); //��ü�� ����� ����
	String str3 =new String("ȫ�浿");
	
	
		
	
	
		if(str1 == str4) {  //������ ���ϴ� ����!!! //���ڿ��� ���Ǯ�� ������
		System.out.println("����");
	}else {
		System.out.println("�ٸ���");
	}

		
		if(str1 == str2) {  //������ ���ϴ� ����!!! //���ڿ��� ���Ǯ�� ������
		System.out.println("��ġ��");
	}else {
		System.out.println("����ġ��");
	}
	
	
		if(str1.equals(str2)) {			//method�� ���ϴ� ����!!!(������!!)
		System.out.println("����");
	}else {
		System.out.println("����ġ");
	}
  
	
	//���׿����� : ���ǽ�? �� : ����
		int score = 95;
		
		String sc = score > 90 ? "A����" : score > 80 ? "B����" : "c����";  //������ ����, Ʋ���� ������
		System.out.println(sc);
		
		
		
		
		
	}
}

















