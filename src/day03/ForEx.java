package day03;

public class ForEx {
	public static void main(String[] args) {
		
		//1~10���� ���� ���Ͻÿ�.
		int num =0;
		for(int i=0; i<=5; i++) {
			num += i;//(sum = sum+1) //���๮ = ���ǽ��� true�϶��� ����
		}
		System.out.println("��� :" + num);
	
			
		//1~10���� ¦���� ���� ���Ͻÿ�.
		int sum = 0;
		int i =0;
		
		for (i = 0; i <= 10 ; i ++ ) {
			if (i % 2 == 0) { //%�������� 0�ΰ�
				sum += i;
			}
		}
		System.out.println("��� :" + sum);
	
	
		for(i =1; i<=10; i++) {
			for(int j=10; j >= i; j--) {
			System.out.print("*");
		}
		System.out.println();
		}

	
	int n = 5; //�� ����
	
	for(int s=1; s<=n; s++) {
		for(int j=n; j>0; j--) {
			
			if(s<j) {
				System.out.printf(" ");
			}else {
				System.out.printf("*");
			}
		}
		System.out.println();
	}
		
	}		

}
	











