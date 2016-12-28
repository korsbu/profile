package DB_Query;

public class QueryInsert {
	private String insertPersonal = "INSERT INTO personal (NUM,MY_NAME,MY_BIRTHDAY,MY_EMAIL,MY_PHONENUM,MY_MAJOR,MY_ADDRESS) VALUES (?,?,?,?,?,?,?)";
	
	public String getInsertPersonal() {
		return insertPersonal;
	}
}