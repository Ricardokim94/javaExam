package day01;

public class If {
	public static void main(String[] args) {
		System.out.println("���ǹ�����");
		
		//������� ���̰� 65�� �̻�, 7�� ���� =��¥, 19��~8�� ���ϴ� 10%����
		
		byte age = 67;
		int fee = 1300;
		
		if(age >= 65 || age <= 7) {
			System.out.println("��¥�Դϴ�.");
		}
		else if(19 >= age && age >= 8 ) {			
			System.out.println(fee*0.9 + "��");
		}
		else {
			System.out.println(fee + "��");
		}
		

		//BMI = ������ / Ű**2
		
		int height = 0;
		int weight = 0;
		int bmi = 0;

		bmi =(int) (weight/ Math.pow(height/100,2));
		
		System.out.println(String.format("%.2f", bmi));
		
		String a = "";
		a = "eco";
		System.out.println(a);
	}
}
















