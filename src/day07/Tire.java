package day07;

public class Tire {
	
	private int maxRotation; //Ÿ�̾� ����
	private int accRotation; //���� ȸ����
	private String location; //Ÿ�̾� ��ġ
	
	
	//������ ����
	protected Tire(){
		
	}
	
	protected Tire(String loc, int num) {
		location = loc;
		maxRotation = num;
	}
	
	
	//Ÿ�̾� ��ġ���� �����ϴ� �޼ҵ� ����
	public String getlocation(){
		return location;
	}
	//Ÿ�̾� ���� ���� �����ϴ� �޼ҵ� ����
	protected int getmaxRotation() {
		return maxRotation;
	}
	//Ÿ�̾� ����ȸ������ �����ϴ� �޼ҵ� ����
	protected int  getAccRotation() {
		return accRotation;
	}
	//����ȸ���� ���� �����ϴ� �޼ҵ� ���� = setAccRotation()
	
	protected void setAccRotation(int Rotation) {
		accRotation = Rotation;
	}
	
	//roll() ȣ��ɶ� acc ���� 1�� ����
	   //accRotation���� maxRotation���� ������ Ÿ�̾� ����(max-acc) ��� �� true
	   //accRotation > maxrotation �� "��ũ" ��� �� false ����
	
	protected boolean roll(){
			accRotation++;
		if(accRotation <= maxRotation) {
			System.out.println(maxRotation - accRotation);
			return true;
		}else {
			System.out.println("**��ũ**");
			return false;
		}
	}
	
}
	




























