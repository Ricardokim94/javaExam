package day05;

public class ClassEx {
	public static void main(String[] args) {
		
//		--��ü����--
//		new ������ȣ��
	Member member = new Member("joy", "1234");
	Member member2 = new Member();

	member.setId("joy");
	member2.setId("admin");
	
	member.setGender('M');
//	System.out.println(member.setGender());
	
	System.out.println(member.login("joy", "1234"));
	System.out.println(member2.login("joy","1234"));
	
	
	System.out.println(member.getId());
	System.out.println(member2.getId());
	}
}
