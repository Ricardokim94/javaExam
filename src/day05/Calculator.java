package day05;

public class Calculator {
	int num1, num2;
	int sum;
	
	Calculator(){
	}
	
	Calculator(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	//더하기 - 리턴 num1 + num2
	//1차원배열
	int add(){
		return num1 + num2;
	}
	
	void add(int num1, int num2){
		sum= num1 + num2;
	}
	
	//2차원배열
	int add(int[] num){
		int sum =0;
		
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	
	int add(int[][] num) {
		int sum =0;

		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				sum += num[i][j];
			}
		}
		
		return sum;
	}
	
	//빼기 - 리턴 num1 - num2
	int sub(){
		return num1 - num2;
	}
	//곱하기
	int mul(){
		return num1 * num2;
	}
	//나누기
	double div(){
		return num1 / num2;	
	}
}
