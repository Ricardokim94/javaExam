package day14;

import java.util.ArrayList;
import java.util.List;

import day05.Member;

public class ArrayListExam {
	
	public static void main(String[] args) {
		//길이가 10인 맴버를 저장하는 배열
		Member[] member = new Member[10];
		
		member[0] = new Member(); 
		member[1] = new Member();
		
		
		
		for(int i=0; i< member.length; i++) {
			member[i] = new Member();
//			member[i].setGender('F');
//			member[i].setId("");
//			System.out.println(i);
		}
		
		
		
		//객체검색
		Member member1 = member[0];
		member1.setGender('F');
		//객체삭제
		member[0] = null;
		
		
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		
			for(int i=0; i < a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
//					System.out.println(a[i][j]);
				}
			}
			
		//ArrayList 객체 생성 방법	
		ArrayList list = new ArrayList();
		
		//객체를 생성하는 방법
		list.add(member1);			
		
		//객체를 검색한는것		
		Object obj=list.get(0);
		Member obj_m = (Member)obj;
		obj_m.getGender();
		
		//형번환을 해줘야 한다. object타입이므로
		System.out.println("리스트 크기 :" + list.size());
		System.out.println("회원성별 : " + ((Member)list.get(0)).getGender());
			
		
		//형변환 하지 않고 제네릭으로 사용
		//ArrayList<Member> list2= new ArrayList<Member>();
		//객체추가
//		list2.add(member1);
//		//객체검색
//		list2.get(0);
		
		List<Member> list2 = new ArrayList<Member>();
		//객체추가
		list2.add(member1);
		list2.add(member1);
		
		Member obg_m2 = list2.get(0);
		
		List<String> listStr = new ArrayList<String>();
		
		listStr.add("홍길동");
		listStr.add("박해달");
		listStr.add("김수달");
		listStr.add("이삼육");
		
		listStr.remove(2);
		
		listStr.add("무등산");
		
		System.out.println(listStr.size());
		System.out.println(listStr.get(3));
		
		//중간에 데이터가 들어오면 다 밀쳐야됨 --> linkedList로 보안!
		
		System.out.println(listStr);
		System.out.println(listStr.get(2));
		System.out.println("리스트배열이 비어있는지 검사 :" + listStr.isEmpty());
		System.out.println("리스트배열이 가리키는 객체갯수 :" + listStr.size());
	
		
		for(int i =0; i< listStr.size(); i++) {
			System.out.println("리스트 배열 : " + i);
		}
	}
}






















