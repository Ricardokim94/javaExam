package day12_practice;

public class Java_lang_Pacage {
	public static void main(String[] args) {

//		String[] arr = {"이순신","홍길동","김유신"};
//		String[] arr2 = arr.clone();
//		
//		System.out.println(arr == arr2);
//		for (String v : arr2) {
//			System.out.println(v);
//		}
//		String[] arr3 = new String[arr.length];
//		System.arraycopy(arr, 0, arr3, 0, arr.length);
//		
//		System.out.println(arr == arr3);
//		for(String v : arr3) {
//			System.out.println(v);
//		}
//		
//	}


	int score = 0;
	boolean bo = true;
	System.out.println("당신의 점수는 : " + score + "입니다");
	
	String s = String.valueOf(score);
	String s1 = String.valueOf(bo);
		System.out.println(s + 10); // 타입을 바꾸지 않는데 String 형태로 가져오고 싶을때 사용.
		System.out.println(s1 + "님아"+2);
		
	}
}











