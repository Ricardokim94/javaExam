package day02;

public class Var_scope {  //Ŭ������ ��
	
	//Ŭ���� �ȿ��� 
	
	//1]������ ������ �����ϴ� (Ŭ���� �ȿ��� ������ ������ = "�ʵ�"��� �Ѵ�!!) ������!
	int no = 50; //���������� =(Ŭ�����ȿ� ��� �������� ���!)
	char grade ='I';
	
	//2]������ ==Ŭ������ ����� ������ �ϴ� �ڵ������� �޸𸮿� �ø��� ������ ��(=�޸� ����)
//		Var_scope(){
//			
//		}  				=> �� �����Ǿ� �ִ�! (�⺻�����ڶ� default����)
	
	//3]�޼��� (����� ��� ����)
	public static void main(String[] args) {
		
		//new �������̸�(); ��������� == ��ü�� �����ϴ� ���
		Var_scope varScope = new Var_scope(); 	//ȣ���ϴ� ���� Ŭ���������� ����Ҽ� ���� (�� �˰������� ������) / �޼ҵ忡�� �����ϴ� ���� ����������� ��!!
		Var_scope varScope2 = new Var_scope();	
			//Ŭ���� Ÿ���� ���� ����
		
		
		varScope.no =60;
		varScope.grade ='U';
		varScope2.no =100;
		varScope2.grade = 'C';
		
		
		System.out.println(varScope.no);		//�������� .�� ���!!!!!!!!!!
		System.out.println(varScope.grade);  

		System.out.println(varScope2.no);  
		System.out.println(varScope2.grade);  
	
	
		if(varScope2.grade > 'A') {
			 Var_scope var3 = new Var_scope();
			System.out.println("������ �ƴ� ���,����̱���");
			var3.grade = 'D';
			
			if(var3.grade > 'A') {
				System.out.println("����");
				varScope.no = 200;
			}
		}
	}
	
}










