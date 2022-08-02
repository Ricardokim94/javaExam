package day03;

public class StringExam {
	public static void main(String[] args) {
		String str1 ="대한민국";
		String str2 ="대한민국";

		String str3 = new String("대한민국");
		String str4 = new String("대한민국");
		System.out.println(System.identityHashCode(str1));
		System.out.format("%X%n",System.identityHashCode(str1));  //%n : 16진수로 나타내줌
		System.out.format("%X%n",System.identityHashCode(str2));  //%n : 16진수로 나타내줌
		System.out.format("%X%n",System.identityHashCode(str3));  //%n : 16진수로 나타내줌
		System.out.format("%X%n",System.identityHashCode(str4));  //%n : 16진수로 나타내줌
		
		
		
		if(str1 == str2) {  //값을 비교하는게 아니라 번지가 같은지 물어보는 거임
			System.out.println("동일한 번지값");
		}else {
			System.out.println("불일치한 번지값");
		}
		
		if("대한민국".equals(str1)) {  //번지값말고 진짜 값이 같냐고 물어볼때는 .equals
			System.out.println("동일한 문자열");
		}else {
			System.out.println("불일치한 문자열");
		}
	
	}
}
