package day09;

public abstract class AbstracEx {
	public static void main(String[] args) {
		//추상클래스의 개념
		/*추상은 객체간에 공통되는 특성을 추출한 것
		 * 추상클래스가 부모, 실체클래스(구현클래스)가 자식
		 * 실체클래스는 추상클래스의 모든 특성을 물려받고(상속의 개념), 추가적인 특성을 가질 수 있다.
		 * WHY? 1)실체클래스의 "공통된 필드와 메소드"의 이름을 통일할 목적
		 * 		2)공통적인 필드와 메소드는 추상클래스에 선언해 두고, 실체 클래스마다 다른 점만 구현
		 * 
		 * 추상클래스 선언 : abstract class 클래스명
		 */
		Animal a = new Animal();
		
		Nature dog = new Dog();
		//강제형변화
		Dog dog2 = (Dog)dog;
		dog2.sound();
		
		Cat cat = new Cat();
		Nature cat2 = new Cat();

		cat.sound();
		dog.weather();
	
		//instanceof 자식타입
	}
}







