package day13;

@SuppressWarnings("hiding")
public class GernericPractice2<Integer> {
	Box<Integer> box = new Box<Integer>();

	private Integer t;
	
	public void set(Integer t) {
		this.t = t;
	}
	
	public Integer get() {
		return t;
	}
}
