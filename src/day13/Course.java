package day13;

public class Course<T> {
	private String name;
	private T[] students;
	
	//생성자 만듬
	public Course(String name, int cnt) {
		super();
		this.name = name;
		this.students = (T[])new Object[cnt];
		
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) { //리턴타입없이 add만 하는 메소드
		for(int i=0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	
	
	
}



















