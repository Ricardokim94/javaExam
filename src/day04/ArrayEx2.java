package day04;

public class ArrayEx2 {
	public static void main(String[] args) {
		
		//1���� �迭
		int[] score = {100, 80 ,90}; //����Ÿ���� ������ ������ �� ���
		
		for(int i=0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		//���� for��
		for(int i : score) {
			System.out.print(i + " ");
		}
		//1���� ��Ʈ�� �迭
		System.out.println("\n");
		System.out.println("�ڡڡٸŴ��١ڡ�");
		String[] strArr = {"«��","���","�ܹ���"};
		for(String i : strArr) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		//2���� �迭
		int[][] intArr = {{1,2},{3,4},{5,6,7}};
		System.out.println("ù��°[2][2]�� ���� :" + intArr[2].length);
		System.out.println("\n");

		System.out.println("-----2���� �迭 ����for��-----");
		//�迭�� ��簪�� ��, ��� ���
		int total =0;
		int count =0;
		for(int[] i : intArr) {
			for(int j : i) {
			  total += j;
			  count++;  //�ѹ��� ī�������ش�!
			}
		}
		System.out.println("�Ѱ��� : " + total);
		System.out.println("��հ��� : " + total/count);

		
		
		
		System.out.println("\n");
		//2���� ���ڿ�
		System.out.println("-----2���� �迭 ����for��-----");
		String[][] strArr2 = {{"A","B"},{"C","D","E"},{"F"}};
		
		for(String[] i : strArr2) {
			for(String j :i) {
				System.out.print(j);
			}System.out.println();
		}
		
		System.out.println("\n----����Ʈ ���----");
		//�迭����
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


































































