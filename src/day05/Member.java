package day05;

public class Member {
	//�ʵ� = �����͸� �����Ѵ�
	private String id;
	String pw;
	String name;
	char gender;
	private int age;
	String[] hobby;
	String wdate;
	

	public Member(){
		super(); 
	}
	
	public Member(String id, String pw){
		this.id = id;
		this.pw = pw;
	}

	public void setId(String id) {
		this.id = id; 
		
	}
	public String getId(){
		return this.id;  
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	public boolean login(String id, String pw){
		if(this.id == id && this.pw == pw) {
			return true;
		}else {
			return false;
		} 
	}
	
	
	public void setGender (char c) {
		this.gender = c;
	}
	public char getGender() {
		return this.gender;
	}
	
}




















