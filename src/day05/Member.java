package day05;

import java.io.Serializable;

public class Member implements Serializable{
	private String id;
	private String pw;
	private String name;
	private char gender;
	private int age;
	private String[] hobby;
	private static String wdate; //static은 직렬화 제외
	

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




















