package day11;

public class Tv implements RemoteControl, Searcher {
	//인터페이스를 구현하는 클래스는 상속 관계가 생긴다.
	//다중상속이 가능하다.(하나의 구현클래스에서 여러개의 인터페이스를 구현 가능)
	
	private int volume;
	
	@Override
	public void turnon() {
		System.out.println("티비를 켭니다");
	}

	@Override
	public void turnoff() {
		System.out.println("티비를 끕니다");
	}

	@Override
	public void setvolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
		this.volume = volume;
	}
		System.out.println("현재 tv볼륨 : " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "검색합니다.");		
	}
}