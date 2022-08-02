package day02;

import java.io.IOException;
import java.util.Scanner;

public class FlowExam {
	public static void main(String[] args) {
		//제어문!!  학점구하기 
		//90이상이면  A   80 > B
		
		System.out.println("점수를 입력하세요 :");
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A등급입니다");
		}else if(score >= 80) {
			System.out.println("B등급입니다");
		}
		else if(score >= 70) {
			System.out.println("C등급입니다");
		}
		else if(score >= 60) {
				System.out.println("D등급입니다");
				
		}else  {
			System.out.println("F급입니다");
		}
		
//		try {
//			System.out.println("문자를 입력하세요");
//			int keyCode = System.in.read();
//			System.out.println();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		
		
	}
}









