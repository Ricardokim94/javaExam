package day08;

import day07.Tire;

public class KumhoTire extends Tire{
	//�ʵ�
	String msg;
	
	
	//������
	
	KumhoTire(String location, int maxRotation){
		//***�θ������ ȣ���� �ݵ��!! ù�ٿ� ����� �Ѵ� super****
		super(location,maxRotation);
	}
	
	
	
	//�޼ҵ� ����
	String getMsg(){
		super.getmaxRotation();
//		System.out.println(super.getmaxRotation());
		msg = "�ִ�ȸ���� ���";
		return msg;
	}
	
	@Override
	protected int getmaxRotation() {
		return super.getmaxRotation();
	}


	//�θ� �޼ҵ� ������ ����(Method overriding)
	//�θ� �޼ҵ�� ������ ����Ÿ��, ������ �޼ҵ��̸�, ������ �Ű����� �̾���Ѵ�.
	//���������� �� ���ϰ� �Ҽ�x(private > default > protected > public)
	//�θ�޼ҵ忡 final�� �پ� ������ �޼ҵ� ������ �Ұ�
	@Override
	protected boolean roll() {
//		accRotation++;
		super.setAccRotation(getAccRotation()+1);
		System.out.print("[" + super.getlocation() +"] ");
			if(getAccRotation() <= getmaxRotation()) {
			System.out.println("��ȣ Ÿ�̾���� :" + (getmaxRotation() - getAccRotation()));
			return true;
		}else {
			System.out.println("**��ũ**");
			return false;
		}
			
	}
//		int call() {
//			return super.getmaxRotation();
//		}
		
}
	



	
	















