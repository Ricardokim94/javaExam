package day07;

public class Tire {
	
	private int maxRotation; //타이어 수명
	private int accRotation; //누적 회전수
	private String location; //타이어 위치
	
	
	//생성자 구현
	protected Tire(){
		
	}
	
	protected Tire(String loc, int num) {
		location = loc;
		maxRotation = num;
	}
	
	
	//타이어 위치값을 리턴하는 메소드 구현
	public String getlocation(){
		return location;
	}
	//타이어 수명 값을 리턴하는 메소드 구현
	protected int getmaxRotation() {
		return maxRotation;
	}
	//타이어 누적회전수를 리턴하는 메소드 구현
	protected int  getAccRotation() {
		return accRotation;
	}
	//누적회전수 값을 설정하는 메소드 구현 = setAccRotation()
	
	protected void setAccRotation(int Rotation) {
		accRotation = Rotation;
	}
	
	//roll() 호출될때 acc 값을 1씩 증가
	   //accRotation값이 maxRotation보다 작으면 타이어 수명(max-acc) 출력 후 true
	   //accRotation > maxrotation 면 "펑크" 출력 후 false 리턴
	
	protected boolean roll(){
			accRotation++;
		if(accRotation <= maxRotation) {
			System.out.println(maxRotation - accRotation);
			return true;
		}else {
			System.out.println("**펑크**");
			return false;
		}
	}
	
}
	




























