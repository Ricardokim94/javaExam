package day05;

public class Car {
	String model;
	String[] tier;
	String color;
	int maxSpeed;
	int Price;
	boolean auto;
	
	//생성자 오버로딩 : 매개변수, 타입의 순서가 다르면 됨
	Car(String model, boolean auto){
		this(model, auto, 5000); //반드시 첫번째 라인에 써야된다.
		this.model = model;
		this.auto = auto;
	}
	Car(String model, int maxSpeed){
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	Car(String model, boolean auto, int price){
		this.model = model;
		this.auto = auto;
		this.Price = price;
	}
	
	
	
	//자동차 달리기 maxSpeed가 0이 되면 멈춤출력 / 달릴때는 현재속도 출력
	//maxSpeed 1씩 감소하면서 운행
	void run() {
		while(true) {
			System.out.print(maxSpeed);
			maxSpeed --;
			if( maxSpeed == 0) {
				System.out.print("Stop");
				break;
			}
		}
	}
	
	
	int maxSpeed(){
		return maxSpeed;
	}
	
	int getPrice(){
		return Price;
	}
	
	String color() {
		return color = "black";
	}
		
}
		


























