package DB_Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DB_Query.QueryDelete;

public class DeleteControl {
	QueryDelete delete = new QueryDelete();
	   
	   public void DeletePersonal(Connection conn,int NUM){
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      
	      try{
	         pstmt = conn.prepareStatement(delete.getDeletePersonal());
	         pstmt.setInt(1,NUM);
	         
	         pstmt.executeUpdate();
	         
	         
	      }catch(SQLException se){
	         se.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         System.out.println("Query Delete End");
	      }
	    }
}
