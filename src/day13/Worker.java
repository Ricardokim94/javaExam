package day13;

public class Worker extends Person{
	private String job;
	//생성자
	Worker(String name){
		super(name);
	}
	

	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
}
