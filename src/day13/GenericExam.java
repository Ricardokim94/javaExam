package day13;

import day08.Car;
import day11.RemoteControl;
import day11.Tv;

public class GenericExam<T> {
	public static void main(String[] args) {
		//제네릭 타입 : class<T>, interface<T>
		//제네릭 타입은 타입을 파라미터(매개변수)로 가지는 클래스와 인터페이스를 말함
		Box box = new Box();
		box.set("알파카인 ");
		//System.out.println(box.get());

		Box<String> box1 = new Box<String>();
		box1.set("홍묵이의 키는");
		String str = box1.get(); //<제네릭은> 강제 형변환 안해도 된다!
		System.out.println(str);
		
		Box<Integer> box3= new Box<Integer>();
		box3.set(180);
		//System.out.print(box3.get());
		
		System.out.println(box.get() + box1.get() + box3.get());

	
		
		Box<Apple> box4 = new Box<Apple>();
		box4.set(new Apple());
		Apple apple = box4.get();
		
		
		//자바 6버전 이하에서는  new Product<Tv, String>() 호출해야 되지만
		//자바 7버전 부터는 new Product<>() 가능
		Product<Tv, String> product = new Product<>(); //우리는 11이니까 생략이 가능하다.
		
		product.setKind(new Tv());
		product.setModel("삼성TV");
		
		
		Tv tv = product.getKind();
		String model = product.getModel();
		
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(model);
		
		
		
		Product<Car, String> product1 = new Product<>();
		
		product1.setKind(new Car());
		product1.setModel("현대자동차");
		
		Car car = product1.getKind();
		String model1 = product1.getModel();
		
		System.out.println(car.run());
		System.out.println(model1);
		car.stop();
		
		
		Util util = new Util();
		
		Util.boxing(new Apple());
		Box<Apple> appleBox = Util.boxing(new Apple());
		appleBox.set(apple);
		

//		util.boxing(new Car());
		Box<Car> boxcar = util.boxing(new Car());
		Car car2= boxcar.get();
		
		Pair<Integer, String>p1 = new Pair<>(1, "사과"); 
		Pair<Integer, String>p2 = new Pair<>(1, "사과"); 
		
		boolean m =Util.compare(p1, p2);
		System.out.println("두객체의 비교결과 : " + m);
		
		
		//제한된 타입 파라미터
		//Util.compare("a","b"); =>제한이 되있어서 안된다Number로
		int rs2 = Util.compare(5, 10);
		System.out.println(rs2); //왼쪽이 더크면 1// 같으면 0// 오른쪽이 더크면 -1
		
		rs2 = Util.compare(4.5, 3);
		System.out.println(rs2);
		
		
		
		
		
	}
}




















