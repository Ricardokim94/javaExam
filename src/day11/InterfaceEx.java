package day11;

public class InterfaceEx {
	public static void main(String[] args) {
		//Tv tv =new Tv();
		Remocon tv = new RemoconImp();	//다시 잘알아두기!!!
		tv.turnon();
		tv.turnoff();
		tv.setvolume(5);
		tv.setmute(true);
		RemoteControl.changebattery();
		tv.search("http://naver.com");
		
		System.out.println("-----------------");
		
//		Radio radio = new Radio();
//		radio.turnoff();
//		radio.turnon();
//		radio.setvolume(19);
//		radio.setmute(true);
//		RemoteControl.changebattery();

			
	}
	
}



