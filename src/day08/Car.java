package day08;

import day07.Tire; //Ÿ�̾ ���� package�� ��� import�������

public class Car {
	//�ʵ�
	//�ڵ�Ÿ�Ժ�ȯ
	//*������ => �ϳ��� Ÿ�Կ� ���� ��ü�� ���� (�ڽİ� �θ���迡����)
	//Ÿ���� Tire�ε� �ȴ� 
	KumhoTire t1 = new KumhoTire("�տ���",6);
	
	
	//�ڵ�Ÿ�Ժ�ȯ : �ڽİ�ü�� �θ�Ÿ������ �ڵ� ��ȯ�ȴ�.
	//�θ�Ÿ������ �ڵ�Ÿ�Ժ�ȯ�� ���Ŀ��� �θ� Ŭ�������� �����
	//�ʵ�� �޼ҵ常 ���ٰ���.
	//��.�ڽ�Ŭ������ �޼ҵ� �������̵� �� ��쿡�� �ڽ� Ŭ���� �޼ҵ尡 ȣ��ȴ�.
	Tire t2 = new HankookTire("�տ�����",2);
	Tire t3 = new KumhoTire("�ڿ���",3);
	Tire t4 = new HankookTire("�ڿ�����",4);
	
	
	
	
	public boolean run(){
		boolean funk1, funk2, funk3, funk4, funk=false;
		System.out.println("�ڵ����� �޸��ϴ�.");
		funk1 = t1.roll();
		//����Ÿ�Ժ�ȯ : �ڽ�Ŭ���� ���� = (��ȯ�ϴ��ڽ�Ŭ����) �θ�Ŭ����Ÿ���ǰ�ü
		HankookTire Tire2 = (HankookTire)t2;
		funk2= Tire2.roll();
		KumhoTire Tire3 = (KumhoTire)t3;
		funk3= Tire3.roll();
		HankookTire Tire4 = (HankookTire)t4;
		funk4= Tire4.roll();
		
		if(!funk1 || !funk2 || !funk3 || !funk4) {
			funk =true; 
		}
			return funk;
		
	}
	
	public void stop(){
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
