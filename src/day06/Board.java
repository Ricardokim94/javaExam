package day06;

 class Board {
	/*
	 * �ʵ�
	 * ����/����/����/�ۼ���/��ȸ��/��������/�ۼ�����
	 */
 //DB���� Java�� �Ѿ�ö��� �� String ���� �Ѿ��
	private int seqNo;
	private String title;
	private String content;
	private String name;
	private int cnt;
	private String open;
	private String wdate;
	
	
	//���Ը��ؼ� get�� �����ִ� ��, set�� �����ϴ°�
	public int getSeqNo() {  //int ����Ÿ�� //seqNo :������ ������ 
		return seqNo;		 // public :������ ������  // get�� ���� �����ְڴٴ� ����
	}
	public void setSeqNo(int seqNo) {  //�ܺη� �ŰԺ����� �޾Ƽ� �ڽ��� seqNo�� ���� �����ϴ°�
		this.seqNo = seqNo;				//���� ���� ���ο� �����ϰڴٴ°�
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
	
	//�޼ҵ�
	
	
	
}
