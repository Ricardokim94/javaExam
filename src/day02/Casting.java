package day02;

public class Casting {
	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = num1;  //받는 그릇이 더 커야함 ex) byte 가 오면 틀린거임
		
		System.out.println(num2);
		
		Var_scope var =new Var_scope();
		
//		var.grade = 'Z';
		System.out.println(var.grade);
		
		//로컬변수들은 참조를 할수 없음 // 필드만 참조할수있음!!!
		
	}
}
