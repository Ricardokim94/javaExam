package day01;

public class Output {
	public static void main(String[] args) {
//		String ��� = "����������";
//		String �� = "say something";
//		System.out.println(��� + ��);
		
		System.out.println(1 == 1);  // �񱳿��굵 �����ϴ�
		
		//����
		//���� Ÿ�� : byte => -128~ +127 
			//char => 2byte
			//short 
			//int => 4byte
		byte score = 127;
		System.out.println(score);
		
		char charval = 65 ;
		System.out.println(charval);
		
		short shorval = 128;
		System.out.println(shorval);
		
		
		
		//�Ǽ� Ÿ�� : double(8byte) , float(4byte)
		
		double charVal = 'A';
		System.out.println("doubleŸ�� :" + charVal);
		
		//���� : boolean : true/false
		boolean status = true;
		System.out.println(status);
		
		final double pi =3.14;
		//final ������ ������ *pi = 3.21 ��x
		System.out.println(pi);
		

		//�⺻������ Ÿ�� : ����,�Ǽ�,����
		
		
		//Ŭ���� Ÿ�� : String, 
		
		String str = "���ѹα�";
		System.out.println(str + "����");
		System.out.println(str.length());
		
		String a = "21";
		String b = "22";
		System.out.println(a+b);
	
//		System.out.println(str.substring(2,1));

		
		//���
		//�ְǹ� : if(), if() {true}else{false}, if(���ǽ�){true} else if(���ǽ�2) {}else{}
		
		int num = 90;
		
		if(num > 90) {
			System.out.println("��� a");
		}
		else if(num > 80) {
			System.out.println("��� b");
		}
		else {
			System.out.println("��� c");
		}

	}
}






































