package day05;

public class Car {
	String model;
	String[] tier;
	String color;
	int maxSpeed;
	int Price;
	boolean auto;
	
	//������ �����ε� : �Ű�����, Ÿ���� ������ �ٸ��� ��
	Car(String model, boolean auto){
		this(model, auto, 5000); //�ݵ�� ù��° ���ο� ��ߵȴ�.
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
	
	
	
	//�ڵ��� �޸��� maxSpeed�� 0�� �Ǹ� ������� / �޸����� ����ӵ� ���
	//maxSpeed 1�� �����ϸ鼭 ����
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
		


























