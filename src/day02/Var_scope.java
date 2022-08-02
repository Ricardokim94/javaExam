package day02;

public class Var_scope {  //클래스의 블럭
	
	//클래스 안에는 
	
	//1]변수의 선언이 가능하다 (클래스 안에서 변수의 선언은 = "필드"라고 한다!!) 구분함!
	int no = 50; //전역변수임 =(클래스안에 모든 영역에서 사용!)
	char grade ='I';
	
	//2]생성자 ==클래스를 기계어로 컴파일 하는 코드정보를 메모리에 올리는 역할을 함(=메모리 적제)
//		Var_scope(){
//			
//		}  				=> 가 생략되어 있다! (기본생성자라서 default값임)
	
	//3]메서드 (기능을 담고 있음)
	public static void main(String[] args) {
		
		//new 생성자이름(); 적어줘야함 == 객체를 생성하는 방법
		Var_scope varScope = new Var_scope(); 	//호출하는 순간 클래스변수를 사용할수 있음 (힙 알고리즘으로 저장함) / 메소드에서 선언하는 것을 지역변수라고 함!!
		Var_scope varScope2 = new Var_scope();	
			//클래스 타입의 변수 생성
		
		
		varScope.no =60;
		varScope.grade ='U';
		varScope2.no =100;
		varScope2.grade = 'C';
		
		
		System.out.println(varScope.no);		//받을때는 .을 사용!!!!!!!!!!
		System.out.println(varScope.grade);  

		System.out.println(varScope2.no);  
		System.out.println(varScope2.grade);  
	
	
		if(varScope2.grade > 'A') {
			 Var_scope var3 = new Var_scope();
			System.out.println("정답을 아는 당신,사람이군요");
			var3.grade = 'D';
			
			if(var3.grade > 'A') {
				System.out.println("정답");
				varScope.no = 200;
			}
		}
	}
	
}










