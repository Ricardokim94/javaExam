package day05;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[][][]arr = new int[2][3][2];

		int cnt =1;
		int num =0;

		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				for(int s=0; s < arr[i][j].length; s++) {
				arr[i][j][s] = cnt++;
				System.out.print(arr[i][j][s] +" ");
				num += arr[i][j][s];
				}
				System.out.println();
			}
			System.out.println(num);
				
		}
//		for(int[][] x : arr) {
//			for(int[] j : x) {
//				for(int s: j) {
//					System.out.print(s);
//				}
//				System.out.println();
//			}
//		}
		
					
		
		
	
	}
}
