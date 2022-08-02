package day12;

public class ExceptionExam {
	public static void main(String[] args) {
		/*
		 *에러 : OutOfMemoryError , StackOverFloweError
		  예외 : Exception
		 *예외 : 1) 일반예외() : 컴파일러 체크 예외, 예외처리코드가 없을 경우 오류발생 
		 * 		2) 실행예외(Runtime Exception) : 컴파일하는 과정에서는 예외처리코드를 검사하지 않음, 실행시 발생
		 * JVM은 프로그램 실행 도중에 예외가 발생하면 해당 예외 클래스로 객체를 생성하고, 예외처리코드에서 예외객체를 이용 할 수 있도록 해준다.
		 */
		
		//예외처리코드 = catch를 할때 위에서 부터 차례대로 한다. 그래서 하위클래스를 위에적고 상위클래스를 밑에적어야 실행된다. 
		//			위에 상위클래스를 적으면 밑에 하위클래스가 실행되지 않는다.
		
		
		try {
			//실행문;
			//if, for, while문 사용시 => 한줄 실행문이라도 중괄호를 생략 불가능하다!
			//if(true) a =10; =>> 오류남!
			//if(true) { int a =10;} => 이렇게 써야함!
	
			//System.out.println(3/0);
			
			int[] arr = {1,2,3};
			//System.out.println(arr[3]);
			
		}catch(ArithmeticException e2) { //ArithmeticException 산수 오류 ex)0으로 나누기같은
			e2.getStackTrace();//예외를 확인하기 위해서!
			System.out.println("0으로 나눌수 없습니다.");
			//예외발생시 실행문작성
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 초가");
		}catch(Exception ex) {
			ex.getStackTrace();
		}
		
		finally {
			//무조건 실행 Exception이 발생하더라도 finally 실행하고 끝남!
			//그래서 stmt.close()같은거를 여기다가 한다.
		}
				
		
		
		String[] strarr = {"10", "2a","3"};
		int value =0;
		for(int i=0; i <= strarr.length; i++) {
			try {
				value = Integer.parseInt(strarr[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과");
			}catch(NumberFormatException e2) {
				System.out.println("숫자로 변환불가");
			}catch(Exception ex) {
				ex.printStackTrace();
			}finally {
				System.out.println(value);
			}
			System.out.println("----------");	
		}
		
	}
}
