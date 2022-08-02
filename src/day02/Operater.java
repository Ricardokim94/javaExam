package day02;

public class Operater {
	public static void main(String[] args) {
		int a, b, c =5;
		a =b =c;
		System.out.println("a:" + a + "\nb:" +b);
	
	a += 1; //a = a+1 (a가 오른쪽으로 가서 +1을 한다는 거임)
	System.out.println(a);

	a %= 2; //나머지를 구하라는 소리임
	System.out.println(a); 
	
	//a++ ==> 뒤에 있는 거에 +1하라는 소리임
	System.out.println(a++);
	//++a 는 수식이후에 하는거라 1이나온다
	System.out.println(a);
	System.out.println(a++ + --b*2);
	
	//나누기
	int num = 3%1;
	System.out.println(num);
	
	
	//문자열 결합 : +
	System.out.println(10 + 9 + "코로나");
	System.out.println("코로나" + 10 + 9);
	System.out.println(10 + 9 +"코로나" + 10 * 9);
	

	//비교연산자
	if(1 != 2 && 3 < 4) {
	System.out.println("같지않음");	
	}
	
	int bit =3;
	bit <<= 2;
	System.out.println(bit);
	
	//문자열 비교
	String str1 ="홍길동";			//상수풀에 담기게 된느 거임
	String str4 ="홍길동";
	
	
	String str2 =new String("홍길동"); //객체를 만드는 거임
	String str3 =new String("홍길동");
	
	
		
	
	
		if(str1 == str4) {  //번지를 비교하는 것임!!! //문자열은 상수풀에 저장함
		System.out.println("같다");
	}else {
		System.out.println("다르다");
	}

		
		if(str1 == str2) {  //번지를 비교하는 것임!!! //문자열은 상수풀에 저장함
		System.out.println("일치함");
	}else {
		System.out.println("불일치함");
	}
	
	
		if(str1.equals(str2)) {			//method를 비교하는 것임!!!(내용을!!)
		System.out.println("같다");
	}else {
		System.out.println("불일치");
	}
  
	
	//삼항연산자 : 조건식? 참 : 거짓
		int score = 95;
		
		String sc = score > 90 ? "A학점" : score > 80 ? "B학점" : "c학점";  //맞으면 왼쪽, 틀리면 오른쪽
		System.out.println(sc);
		
		
		
		
		
	}
}

















