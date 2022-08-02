package day11;

public interface RemoteControl {
	//상수필드
	//인터페이스 상수는 static{ } 사용할수 없다.
	//[public static final] 생략가능 
		int MAX_VOLUME = 10;
		int MIN_VOLUME = 0;
		 
	//생성자x
	
	//추상메서드
	//[public abstract] 생략됨 (인터페이스는 안적어도됨)
		//추상메서드는 반드시 구현해줘야 한다.
		void turnon();
		void turnoff();
		void setvolume(int volume);
		
	//default 메서드 : jdk8버전 이후 사용가능
	//[public]이 생략됨	
		//default 메서드는 반드시 구현할 필요없다.
		default void setmute(boolean mute) {
			//뮤트가 true이면 "무음처리 완료", false이면 "무음해제"
			if(mute) {
				System.out.println("무음처리 완료");
			}else{
				System.out.println("무음해제");
			}
		}
	
	//static 정적 메서드 : jdk8버전 이후 사용가능
	//[public]이 생략됨
	static void changebattery() {
		System.out.println("건전지 교체");
	}






}
