package day08;

public class Car2 {
	Tire2[] tire = {
		new KumhoTire2("�տ���",3),
		new KumhoTire2("�տ�����",2),
		new HankookTire2("�ڿ�����",3),
		new HankookTire2("�ڿ�����",4),
	};
	
	
	
	boolean run(){
		System.out.println("�ڵ����� �޸��ϴ�.");
		
		boolean funk = false;
			
		for(int i=0; i <tire.length; i++) {
			if(tire[i].roll() == false) {
			funk =true;
			}
		}
		return funk;
	}			
	
 	void stop(){
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
