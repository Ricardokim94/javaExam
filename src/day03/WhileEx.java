package day03;

import java.util.Arrays;
import java.util.Random;

public class WhileEx {
	public static void main(String[] args) {
		//while��
//		int[] n = new int[6];
		
		int num [] = new int[6];

		System.out.println(num.length); 		
		
		int i=0;
		while(i<6 ) {
			int lotto = (int)(Math.random()*45)+1;
		
			for(int j =0; j < i; j++) {
				if(num[j] == lotto) {
					lotto = (int)(Math.random()*45)+1;
					j = -1;
				}
			}
			num[i] = lotto;
			i++;
		}
		for(int j=0; j<6; j++) {
			System.out.print(num[j]);
			if(j == 3) continue;
			if(j != 5) System.out.print(",");
			
		}
	
		System.out.println("\n");
		
		//do while��
		String[] menu  = {"�ҹ�", "«��", "�������", "���"};
		int[] cnt = {0,0,0,0};
		int no =1;
		
		do { 
			int rd = (int)(Math.random()*menu.length);
			System.out.print(rd + ",");
			cnt[rd]++;
		} while(no++ < 10);
		
		//�ִٷ� ���õ� �޴� ���
		int maxIdx =0;
		for(int j =0; j<cnt.length; j++) {
			System.out.println("\n cnt["+ j + "]] =" + cnt[j]);			
			if(cnt[j] >= cnt[maxIdx]) {
				maxIdx = j;
			}
		}
		
		//����������
		System.out.println("�ִټ��� �޴��� = ");
		for(int j =0; j < cnt.length; j++) {
			if(cnt[j] == cnt[maxIdx]) {
				System.out.print(menu[j]);
				System.out.println(",");
			}
		}
		
		
	}
		
}


























