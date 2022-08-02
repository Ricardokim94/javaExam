package day11;

public interface Remocon extends RemoteControl,Searcher{

	@Override
	default void search(String url) {
		System.out.println("리모콘 인터페이스검색기입니다.");
	}
	//추상메서드로도 가능하다=> 
	void setmute(boolean mute); 

	//<default 메서드가 있는 interface 상속 받는 경우>
	//default 메서드를 추상메서드로 재선언이 가능.
	//default 메서드를 재정의해서 실행 내용 변경 가능.
	
	
	
}
