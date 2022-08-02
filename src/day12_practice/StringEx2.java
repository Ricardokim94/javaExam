package day12_practice;

public class StringEx2 {
	public static void main(String[] args) {
		
		String name1 = "홍길동";
		String name2 = "홍길동";
	
		if(name1 == name2) {
			System.out.println("name1 == name2");
		}else {
			System.out.println("name1 != name2");
		}
	
	
	String str = "Hellow My name is Hong gil dong 13";
		//1]]]""번째 값출력
		System.out.println("1번 " + str.charAt(0));
		//2]]]아스키코드값으로 변환하여 출력
		System.out.println("2번 " + str.codePointAt(0));
		//3]]]문자열의 앞과 뒤 공백을 제거하여 리턴
		System.out.println("3번 " + str.trim());
		//4]]]문자열을 대문자로 변환하여 리턴
		System.out.println("4번 " + str.toUpperCase());
		//5]]]문자열을 소문자로 변환하여 리턴
		System.out.println("5번 " + str.toLowerCase());
		//6]]]String 객체에 저장되어 있는 문자열 리턴
		System.out.println("6번 " + str.toString());
		//문자열을 매개변수 regex를 구분자로 나눠서 배열로 리턴
		
		String str1 = "홍길동,이순신,유관순,안중근";
		String[]arr = str1.split(",");
		for(int i=0; i <arr.length; i++) {
			System.out.println("7번 "+i + arr[i]);
			}
		
	
		
		
	}
}
