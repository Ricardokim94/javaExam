package day11_Board;

public class BoardControl {
	
	private void get(Board[] board) {
		for(int i =0; i < board.length; i++ ) {
			System.out.println(board[i].getTitle());
			System.out.println(board[i].getContent());
			System.out.println(board[i].getSeqno());
			System.out.println("=========================");
			}
		}
	
	public static void main(String[] args) {
		BoardServiceImpl bs = new BoardServiceImpl();
		//new BoardControl().get(bs.listBoard());
		
		//keyword
		String keyword = "립옭";
		String category = "title";
		Board[] rs = bs.listBoard(category,keyword);
		
		if(rs.length>0) {
			new BoardControl().get(rs);	
		}else {
			System.out.println("게시물이 없습니다.");
		}
		
	}

	
	
}








