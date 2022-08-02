package day12_practice;

public class StringEx9 {
	public static void main(String[] args) {
		
//		String str1 = "abcd";
//		String str2 = "abcd";
//		System.out.println("str1 =" + System.identityHashCode(str1));
//		System.out.println("str2 =" + System.identityHashCode(str2));
//		
//		str1 = str1 + "efg";
//		System.out.println("str1 =" + System.identityHashCode(str1));
		
		
//		StringBuffer sb1 = new StringBuffer("abcd");
//		System.out.println("문자열 연결전 sb1 =" + System.identityHashCode(sb1));
//		
//		sb1.append("efgh");
//		System.out.println("문자열 연결후 sb1 = " + System.identityHashCode(sb1));
//		
//		System.out.println(sb1.toString().equals("abcdefgh"));

		
		
		StringBuffer sb = new StringBuffer();
		
		//메서드 체이닝으로 여러 타입의 매개변수값을 StringBuffer 객체의 문자열 값에 추가
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb);
		//2~3번 인덱스값 삭제
		sb.delete(2, 5);
		System.out.println(sb);
		//4번 인덱스값 삭제
		sb.deleteCharAt(4);
		System.out.println(sb);
		//5번 인덱스에 ==추가
		sb.insert(5, "==");
		System.out.println(sb);
		//6번 인덱스에 1.23추가(문자열로 변환)
		sb.insert(6, 1.23);
		System.out.println(sb);
		
	}
}









