package Excute;

import java.sql.Connection;
import java.sql.ResultSet;

import DB_Control.InsertControl;
import DB_Control.DeleteControl;
import DB_Control.SelectControl;
import Connect.Oracledb_Connect;
public class DB_Excute {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oracledb_Connect oraConn = new Oracledb_Connect();
		
		Connection conn = oraConn.Connect();
		
		if ( conn != null) System.out.println("Oracle Connect Success");
		else System.out.println("Oracle Connect Fail");
		
		//InsertControl ic = new InsertControl();
		//ic.InsertPersonal(conn, 1, "���ػ�","1991-06-22","korsbu@naver.com","010-3315-5082","������Ű��а�","��õ ������ ȣ������ 899���� 8 ����@ 101�� 601ȣ");
		//DeleteControl dc = new DeleteControl();
		//dc.DeletePersonal(conn,1);
		SelectControl sc = new SelectControl();
		ResultSet rs = sc.SelectPersonal(conn);
	}
}
