package day13;

public class Student extends Person{
	private String school;

	Student() {
	
	}

	Student(String name, String school){
		super(name); //부모한테 던짐
		this.school = school; 
		//받는거는 둘다 
		//but 부모한테던질때는 name만
	}
	
	Student(String school){ //한개짜리는 자기자신에 저장한다는소리임
		this.school = school;
	}
	
	Student(String school, String name, int age){
		super(name,age);
		this.school = school;
	}
	Student(String name, int age) { 
		super(name,age); //부모한테 던지는것
	}


	
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
	
}
