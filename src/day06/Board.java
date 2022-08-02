package day06;

 class Board {
	/*
	 * 필드
	 * 순번/제목/내용/작성자/조회수/공개여부/작성일자
	 */
 //DB에서 Java로 넘어올때는 다 String 으로 넘어옴
	private int seqNo;
	private String title;
	private String content;
	private String name;
	private int cnt;
	private String open;
	private String wdate;
	
	
	//쉽게말해서 get은 던져주는 값, set은 설정하는값
	public int getSeqNo() {  //int 리턴타입 //seqNo :리턴할 데이터 
		return seqNo;		 // public :접근할 데이터  // get은 값을 던저주겠다는 것임
	}
	public void setSeqNo(int seqNo) {  //외부로 매게변수를 받아서 자신의 seqNo에 값을 설정하는것
		this.seqNo = seqNo;				//받은 값을 내부에 설정하겠다는것
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String isOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	
	//메소드
	
	
	
}
