package DB_Control;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DB_Query.QuerySelect;

public class SelectControl {
	
	QuerySelect select = new QuerySelect();
	
	public ResultSet SelectPersonal(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			pstmt = conn.prepareStatement(select.getSelectPersonal());
			
			rs = pstmt.executeQuery();
			
			System.out.println("SELECT RESULT COUNT : " + rs.getRow());
			while(rs.next()){
				int NUM = rs.getInt("NUM");
				String MY_NAME = rs.getString("MY_NAME");
				
				System.out.println("NUM : " + NUM + "\t MY_NAME : " + MY_NAME );
			}
			
			System.out.println("SELECT RESULT COUNT : " + rs.getRow());
			
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Query Select End");
		}
		
		return rs;
	}
	
	public ResultSet SelectPersonalAboutNUM(Connection conn, int NUM){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		
		return rs;
	}
}
