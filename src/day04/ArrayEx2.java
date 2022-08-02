package day04;

public class ArrayEx2 {
	public static void main(String[] args) {
		
		//1차원 배열
		int[] score = {100, 80 ,90}; //같은타입을 여러개 저장할 때 사용
		
		for(int i=0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		//향상된 for문
		for(int i : score) {
			System.out.print(i + " ");
		}
		//1차원 스트링 배열
		System.out.println("\n");
		System.out.println("★★☆매뉴☆★★");
		String[] strArr = {"짬뽕","김밥","햄버거"};
		for(String i : strArr) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		//2차원 배열
		int[][] intArr = {{1,2},{3,4},{5,6,7}};
		System.out.println("첫번째[2][2]의 길이 :" + intArr[2].length);
		System.out.println("\n");

		System.out.println("-----2차원 배열 향상된for문-----");
		//배열의 모든값의 합, 평균 출력
		int total =0;
		int count =0;
		for(int[] i : intArr) {
			for(int j : i) {
			  total += j;
			  count++;  //한번씩 카운팅해준다!
			}
		}
		System.out.println("총값은 : " + total);
		System.out.println("평균값은 : " + total/count);

		
		
		
		System.out.println("\n");
		//2차원 문자열
		System.out.println("-----2차원 배열 향상된for문-----");
		String[][] strArr2 = {{"A","B"},{"C","D","E"},{"F"}};
		
		for(String[] i : strArr2) {
			for(String j :i) {
				System.out.print(j);
			}System.out.println();
		}
		
		System.out.println("\n----리스트 출력----");
		//배열복사
		char[] charVal = {'a','b','c'};
		
		char[] newVal= new char[6];
		
		newVal[2] = charVal[0];	
		newVal[3] = charVal[1];	
		newVal[4] = charVal[2];	
//		System.out.println(newVal);
		
		System.arraycopy(charVal, 0, newVal, 2 , 3);
		System.out.println(newVal);
		
//		int cnt2 =0;
//	for(char c :newVal) {
//		System.out.println("["+ cnt2++ +"] = " + c);
//	}	
		
	
		
		
	
	
		
		
}
}


































































