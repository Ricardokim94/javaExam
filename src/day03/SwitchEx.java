package day03;

public class SwitchEx {
	public static void main(String[] args) {
		//switch문
		//A면 관리자 G면 게스트 U면 회원
		char grade ='A';

		switch(grade) { 
		case 'A':
			System.out.println("관리자");
			break;
		case 'T':
			System.out.println("교사");
			break;
		case 'S':
			System.out.println("학생");
			break;
		default :
			System.out.println("유령입니다");
		}
		
		
	}
}
