package DB_Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DB_Query.QueryInsert;

public class InsertControl {
	 QueryInsert insert = new QueryInsert();
	   
	   public void InsertPersonal(Connection conn,int NUM,String MY_NAME,String MY_BIRTHDAY,String MY_EMAIL,String MY_PHONENUM,String MY_MAJOR,String MY_ADDRESS){
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      
	      try{
	         pstmt = conn.prepareStatement(insert.getInsertPersonal());
	         pstmt.setInt(1,NUM);
	         pstmt.setString(2,MY_NAME);
	         pstmt.setString(3,MY_BIRTHDAY);
	         pstmt.setString(4,MY_EMAIL);
	         pstmt.setString(5,MY_PHONENUM);
	         pstmt.setString(6,MY_MAJOR);
	         pstmt.setString(7,MY_ADDRESS);
	         pstmt.executeUpdate();
	         
	         
	      }catch(SQLException se){
	         se.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         System.out.println("Query Insert End");
	      }
	      
	   }
}
