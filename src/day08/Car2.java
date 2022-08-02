package day08;

public class Car2 {
	Tire2[] tire = {
		new KumhoTire2("앞왼쪽",3),
		new KumhoTire2("앞오른쪽",2),
		new HankookTire2("뒤오른쪽",3),
		new HankookTire2("뒤오른쪽",4),
	};
	
	
	
	boolean run(){
		System.out.println("자동차가 달립니다.");
		
		boolean funk = false;
			
		for(int i=0; i <tire.length; i++) {
			if(tire[i].roll() == false) {
			funk =true;
			}
		}
		return funk;
	}			
	
 	void stop(){
		System.out.println("자동차가 멈춥니다.");
	}
}
