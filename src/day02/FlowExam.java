package day02;

import java.io.IOException;
import java.util.Scanner;

public class FlowExam {
	public static void main(String[] args) {
		//���!!  �������ϱ� 
		//90�̻��̸�  A   80 > B
		
		System.out.println("������ �Է��ϼ��� :");
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A����Դϴ�");
		}else if(score >= 80) {
			System.out.println("B����Դϴ�");
		}
		else if(score >= 70) {
			System.out.println("C����Դϴ�");
		}
		else if(score >= 60) {
				System.out.println("D����Դϴ�");
				
		}else  {
			System.out.println("F���Դϴ�");
		}
		
//		try {
//			System.out.println("���ڸ� �Է��ϼ���");
//			int keyCode = System.in.read();
//			System.out.println();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		
		
	}
}









