package login;

import java.util.Scanner;

public class ExceptionEx8 {

	static String id = "목이";
	static String pw = "123123";
	static Scanner scan = new Scanner(System.in);

public static void main(String[] args) throws Exception{
		try {
			System.out.println("아이디 :");
			String input_id = scan.nextLine();
				
			System.out.println("비밀번호 :");
			String input_pw = scan.nextLine();
				
			if (!id.equals(input_id)) {
				throw new LoginException("아이디가 올바르지 않습니다");
			}else if (!pw.equals(input_pw)) {
				throw new LoginException("비밀번호가 올바르지 않습니다");
			}else {
				System.out.println("로그인 성공");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
