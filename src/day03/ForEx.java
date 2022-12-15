package day03;

public class ForEx {
	public static void main(String[] args) {
		
		//1~10까지의 합을 구하시오.
		int num =0;
		for(int i=0; i<=5; i++) {
			num += i;//(sum = sum+1) //실행문 = 조건식이 true 일때만 실행
		}
		System.out.println("��� :" + num);
	
			
		//1~10까지 짝수의 합을 수하시오.
		int sum = 0;
		int i =0;
		
		for (i = 0; i <= 10 ; i ++ ) {
			if (i % 2 == 0) { //%나머지가 0인것
				sum += i;
			}
		}
		System.out.println("결과 :" + sum);
	
	
		for(i =1; i<=10; i++) {
			for(int j=10; j >= i; j--) {
			System.out.print("*");
		}
		System.out.println();
		}

	
	int n = 5; //행 갯수
	
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
	











