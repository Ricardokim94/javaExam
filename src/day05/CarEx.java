package day05;

public class CarEx {
	public static void main(String[] args) {
		
		Car c = new Car("grender", true); 
		Car mo = new Car("morning", false); 
		Car mini = new Car("sonata",10); 
			
		System.out.println(c.color());
		System.out.println(mo.getPrice());
		System.out.println(mo.auto);
		System.out.println(mo.Price);
		
		mini.run();
		
	}
}
