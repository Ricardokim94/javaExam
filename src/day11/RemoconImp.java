package day11;

public class RemoconImp implements Remocon{

	private int volume;

	@Override
	public void turnon() {
		System.out.println("리모콘 새로운 키기");
	}

	@Override
	public void turnoff() {
		System.out.println("리모콘 새로운 끄기");
		
	}

	@Override
	public void setvolume(int volume) {
		this.volume = volume;
		System.out.println("소리크기 : " + this.volume);
	}

	@Override
	public void setmute(boolean mute) {
		System.out.println("음소거 : " + mute);
	}

	@Override
	public void search(String url) {
		System.out.println(url +"리모콘 검색기 입니다");
	}
	
	

}




