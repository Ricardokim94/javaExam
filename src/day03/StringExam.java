package day03;

public class StringExam {
	public static void main(String[] args) {
		String str1 ="���ѹα�";
		String str2 ="���ѹα�";

		String str3 = new String("���ѹα�");
		String str4 = new String("���ѹα�");
		System.out.println(System.identityHashCode(str1));
		System.out.format("%X%n",System.identityHashCode(str1));  //%n : 16������ ��Ÿ����
		System.out.format("%X%n",System.identityHashCode(str2));  //%n : 16������ ��Ÿ����
		System.out.format("%X%n",System.identityHashCode(str3));  //%n : 16������ ��Ÿ����
		System.out.format("%X%n",System.identityHashCode(str4));  //%n : 16������ ��Ÿ����
		
		
		
		if(str1 == str2) {  //���� ���ϴ°� �ƴ϶� ������ ������ ����� ����
			System.out.println("������ ������");
		}else {
			System.out.println("����ġ�� ������");
		}
		
		if("���ѹα�".equals(str1)) {  //���������� ��¥ ���� ���İ� ������� .equals
			System.out.println("������ ���ڿ�");
		}else {
			System.out.println("����ġ�� ���ڿ�");
		}
	
	}
}
