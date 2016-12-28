package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
public class Oracledb_Connect {
	public Connection Connect(){
		Connection conn = null;
		String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		
		try{
			Class.forName("oracle.jdbc.OracleDriver");
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
		
		try{

			conn = DriverManager.getConnection(dbUrl, "JUNSANG", "1234");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
		return conn;
	}
}