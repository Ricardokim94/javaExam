package day11_Board;

public interface Boardservice {
	
	//게시물등록
	void insertBoard(Board board);

	//게시물 리스트 출력 - 레코드가 여러개 들어가므로 배열을 사용해야한다.
	Board[] listBoard(); //리스트를 찍음
	
	Board[] listBoard(String category,String keyword); //메서드 오버로딩

	//게시물 수정
	Board modifyBoard(Board board);

	//게시물 삭제
	void deleteBoard(String seqno);

	//게시물 찾기

		
}
