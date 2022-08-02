package day13;

public class HighStudent extends Student{
	private int grade;
	
	HighStudent() {

	}
	
	HighStudent(String name) {
		super(name);	
		
	}

	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
