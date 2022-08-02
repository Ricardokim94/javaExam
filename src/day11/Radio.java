package day11;

public class Radio implements RemoteControl{
	
	private int volume;

	
	@Override
	public void turnon() {
		System.out.println("라디오를 켭니다");
	}

	@Override
	public void turnoff() {
		System.out.println("라디오를 끕니다");
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
		System.out.println("현재 라디오볼륨 : " + this.volume);
	}

}
