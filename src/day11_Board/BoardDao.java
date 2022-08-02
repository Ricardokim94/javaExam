package day11_Board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import day10.OracleConn;

public class BoardDao {
	
	private final static Connection conn = OracleConn.getInstance().getConn();
	
	Board[] getLists(String category, String keyword){
		
		String sql = "SELECT rownum, seqno, title, content, wdate, count, name";
	 		sql += " FROM (";
			sql += " SELECT seqno,title, content,"; 
			sql += " TO_CHAR(b.wdate, 'yyyy\"년\"mm\"월\"dd\"일\" HH:MI:SS PM', 'nls_date_language=american') wdate,";
			sql += " count,name";
			sql += " FROM board b, member m";
			sql += " WHERE b.id = m.id ";
			if(category != null && category.equals("title")) sql += " and b.title like ?";
			if(category != null && category.equals("name")) sql += " and m.name like ?";

			sql += " order by wdate desc)";
			sql += " WHERE rownum between 1 and 10000";
		
		PreparedStatement stmt;
		Board[] board =null;
	
		try {
			stmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,
												ResultSet.CONCUR_UPDATABLE);
			
			if(category != null) stmt.setString(1, "%" +keyword+ "%");

			ResultSet rs = stmt.executeQuery();
			rs.last();
			board = new Board[rs.getRow()];
			rs.beforeFirst(); //커서를 헤더로이동
			
			int i=0;
			while(rs.next()) {
				Board b =new Board();
				b.setSeqno(rs.getString("seqno"));
				b.setTitle(rs.getString("title"));
				b.setContent(rs.getString("content"));
				board[i++] = b;
				
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResource(conn);
		}
		
		return board;
	}

	void closeResource(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
















