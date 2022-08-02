package day04;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
//		System.out.println(args[0]);
		
//		for (int i =0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}


		int[] score; //배열 생성
		int sum =0;
		
			score = new int[5];
			score[0] = 10;
			score[1] = 20;
			score[2] = 30;
			score[3] = 40;
			
		
			//향상된for문
			
			System.out.println("향상된 for문 출력");
			for(int s : score) { 	//for(배열의타입 배열 : 배열변수){  }
				System.out.println(s);					
			}
			
		
		//String[] name = null;
		//name = new String[3];
		String hello []= {"김창목","강홍묵","이재신"}; 

		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(hello));
		System.out.format("%x%n", System.identityHashCode(score[0]));
		System.out.format("%x%n", System.identityHashCode(score[1]));
		System.out.format("%x%n", System.identityHashCode(score[2]));
		System.out.format("%x%n", System.identityHashCode(score[3]));
		
		
		int arry1[] = {1,2,3};
		int arry2[] = new int[3];
		
		int arry3[][] = new int[2][3];
		
		System.out.println("향상된 어레이");
		for(int[] i:arry3) {
			for(int j:i) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		
		int[][][] arry4 = {{{1,2,3}},{{4,5,6}},{{7,8,9}}};
		
		
		for(int i=0; i < arry4.length; i++) {
			for(int j=0; j < arry4[i].length; j++) {
				for(int s=0; s < arry4[i][j].length; s++) {
				System.out.print(arry4[i][j][s] +" ");
			}
			System.out.println();
		}
			
	}
		System.out.println("끝");
		for(int[][] x : arry4) {
			for(int[] j : x) {
				for(int s: j) {
					System.out.print(s);
				}
			}
		}
		System.out.println("");
		
			String[][] th = {{"페트병","1회용컵"},
								{"병"},
								{"캔","고철","알루미늄"}};
		
			for(int i=0; i < th.length; i++) {
				for(int j=0; j<th[i].length; j++) {
					System.out.print(th[i][j]+" ");
				}
				System.out.println();
			}
		
			
			//향상된 for문
			for(String[] i:th) {
				for(String j:i) {
					System.out.print(j);
				}
				System.out.println();
			}
			
		
			
			
}
}















