package day07;

public class CarEx {
 
	static String model;
	
	public static void main(String[] args) {
		
		model ="bmw";
		
		Car.info().setCompany("현대");
		System.out.println(Car.info().getCompany());
	
	//타이어 생성자 호출
		
		Tire t1 =new Tire("FL", 10);
		Tire t2 =new Tire("FR", 8);
		
		System.out.println("---------------");
		for(int i =0; i<= t1.getmaxRotation(); i++) {
			t1.roll();
		}
		
		
		System.out.println(t1.getlocation());
		System.out.println(t1.getmaxRotation());
		System.out.println(new Tire("FL", 10).getlocation());
		System.out.println(new Tire("FL", 10).getmaxRotation());
		
		t1.setAccRotation(1);
		System.out.println(t1.getAccRotation());
		
	
	}
}