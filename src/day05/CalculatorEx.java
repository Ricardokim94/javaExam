package day05;

public class CalculatorEx {
	public static void main(String[] args) {
		
		Calculator c = new Calculator(20,10);
		Calculator c2 = new Calculator(30,10);
		Calculator c3 = new Calculator();

		
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.mul());
		System.out.println(c.div());
		System.out.println("==========");
		System.out.println(c2.add());
		System.out.println(c2.sub());
		System.out.println(c2.mul());
		System.out.println(c2.div());

		
		
		int[] num = {1,2,3,4,5}; 
		
		int v = c3.add(num);
		System.out.println(v);
		
		
		int[][] a = {{1,2,3},{4,5,6}};
		int h = c3.add(a);
		System.out.println(h);
		
	}
}



