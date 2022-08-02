package day01;

public class If {
	public static void main(String[] args) {
		System.out.println("조건문연습");
		
		//버스요금 나이가 65세 이상, 7세 이하 =꽁짜, 19세~8세 이하는 10%할인
		
		byte age = 67;
		int fee = 1300;
		
		if(age >= 65 || age <= 7) {
			System.out.println("꽁짜입니다.");
		}
		else if(19 >= age && age >= 8 ) {			
			System.out.println(fee*0.9 + "원");
		}
		else {
			System.out.println(fee + "원");
		}
		

		//BMI = 몸무게 / 키**2
		
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
















