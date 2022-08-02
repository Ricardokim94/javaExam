package day13;

@SuppressWarnings("hiding")
public class GernericPractice<String> {
	Box<String> box = new Box<String>();
	
	private String t;
	
	public void set(String t) {
		this.t= t;
	}
	
	public String get() {
		return t;
	}
}
