package day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import day05.Member;

public class SetExam {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("th리");
		set.add("목이");
		set.add("정후");
		set.add("정후");
		
		//바구니 삭제
		set.remove("정후");

		//System.out.println(set);
		System.out.println(set.size());
		
		Iterator<String> it = set.iterator(); //반복자 얻기
		while(it.hasNext()) { 
			String name = it.next(); //한개의 객체를 가져옴
			System.out.print(name + "\t");
		}
		
		//바구니 모두 삭제
		set.clear();
		
		//비워져있는지 확인하는것
		if(set.isEmpty()) {
			System.out.println("바구니가 없습니다.");
		}
		
		Set<Member> set2 = new HashSet<Member>();
		set2.add(new Member("joy","1234"));
		set2.add(new Member("joy","1234"));
		
		System.out.println(set2.size());
		
	}
}









