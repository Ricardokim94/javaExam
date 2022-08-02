package day06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import day05.Member;


public class BoardService {
	//필드
	static Member member;
	
	public static void main(String[] args) {
	
	   BoardService bs = new BoardService();
		
		
		DB db = new DB();
		Connection conn =db.mysqlConn();	
		
		DB db2 = new DB();
		
		DB.mysqlConn();
	
	
	System.out.format("%x",System.identityHashCode(db));
	System.out.format("%x",System.identityHashCode(db2)); //주소알아보는법
	
	
	
	//DB연결
		Board[] board = null;
		
		try {
			
			
			String sql = "select * from board";
			PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, 
																ResultSet.CONCUR_UPDATABLE );
			ResultSet rs = stmt.executeQuery();
			
			
			//레코드 개수 구하기
			
			rs.last();
			int rows = rs.getRow();	  //getRow = 현재 행번호	
			System.out.println(rows); //변수에 담음
			
			//rs.first();
			rs.beforeFirst(); //커서를 첫번째빈칸 set
			System.out.println(rs.getRow());
			
			board = new Board[rows]; //사이즈를 행갯수로 만듦
			
			
			for(int i=0; i< board.length; i++) {
				rs.next(); //맨 밑에서 다시 next하면 커서가 위로 올라단다(1번쨰로)		
				board[i] = new Board();
				
				board[i].setSeqNo(rs.getInt("idx"));
				board[i].setTitle(rs.getString("title"));
				board[i].setContent(rs.getString("content"));
				board[i].setName(rs.getString("id"));
				board[i].setCnt(rs.getInt("cnt"));
				board[i].setOpen(rs.getString("open"));
				board[i].setWdate(rs.getString("wdate"));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		for(int i=0; i < board.length; i++) {
			System.out.print(board[i].getSeqNo());
			System.out.print(board[i].getTitle());
			System.out.print(board[i].getContent());
			System.out.print(board[i].getName());
			System.out.print(board[i].getCnt());
			System.out.print(board[i].isOpen());
			System.out.print(board[i].getWdate());
			System.out.println();
		}
	}
}

		
//		for(Board b : board) {
//			System.out.print(b.getSeqNo());
//			System.out.print(b.getTitle());
//			System.out.print(b.getContent());
//			System.out.print(b.getName());
//			System.out.print(b.getCnt());
//			System.out.print(b.isOpen());
//			System.out.print(b.getWdate());
//			System.out.println();
//		}

	
	
	








