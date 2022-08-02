package day13;

import java.util.ArrayList;
import java.util.List;

public class Box <Apple>{
	//T : type // K : key // V : value // N : number // E : element 
	private Apple t;
	
	public void set(Apple t) {
		this.t = t;
	}
	
	public Apple get() {
		return t;
	}
	public static void main(String[] args) {
	
//	List list =  new ArrayList();
//	list.add("hello");
//	String str = (String) list.get(0);
	List<String> list = new ArrayList<String>();
	list.add("hello");
	String str = list.get(0);
	System.out.println(str);
	
	
	

	
	}
	
}
