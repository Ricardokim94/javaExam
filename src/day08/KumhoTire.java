package day08;

import day07.Tire;

public class KumhoTire extends Tire{
	//필드
	String msg;
	
	
	//생성자
	
	KumhoTire(String location, int maxRotation){
		//***부모생성자 호출은 반드시!! 첫줄에 적어야 한다 super****
		super(location,maxRotation);
	}
	
	
	
	//메소드 정의
	String getMsg(){
		super.getmaxRotation();
//		System.out.println(super.getmaxRotation());
		msg = "최대회전수 출력";
		return msg;
	}
	
	@Override
	protected int getmaxRotation() {
		return super.getmaxRotation();
	}


	//부모 메소드 재정의 가능(Method overriding)
	//부모 메소드와 동일한 리턴타입, 동일한 메소드이름, 동일한 매개변수 이어야한다.
	//접근제한을 더 강하게 할수x(private > default > protected > public)
	//부모메소드에 final이 붙어 있으면 메소드 재정의 불가
	@Override
	protected boolean roll() {
//		accRotation++;
		super.setAccRotation(getAccRotation()+1);
		System.out.print("[" + super.getlocation() +"] ");
			if(getAccRotation() <= getmaxRotation()) {
			System.out.println("금호 타이어수명 :" + (getmaxRotation() - getAccRotation()));
			return true;
		}else {
			System.out.println("**펑크**");
			return false;
		}
			
	}
//		int call() {
//			return super.getmaxRotation();
//		}
		
}
	



	
	















