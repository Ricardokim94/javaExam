package day08;

public class InheritanceEx {
	public static void main(String[] args) {
		
	KumhoTire t1= new KumhoTire("¾Õ¿ÞÂÊ",10);
	KumhoTire t2= new KumhoTire("¾Õ¿ÞÂÊ",8);
	t1.getlocation();
	
//	System.out.println(t1.getlocation());
//	System.out.println(t1.getMsg());
	
		for(int i =0; i<= t2.getmaxRotation(); i++) {
			t1.roll();
		}
	}
}

