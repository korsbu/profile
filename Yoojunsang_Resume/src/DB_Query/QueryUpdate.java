package DB_Query;

public class QueryUpdate {
	
	private String updatePersonalPhonenum = "UPDATE personal SET MY_PHONENUM = ? WHERE MY_NAME = ?";
	
	public String getUpdateEmpSal(){
		return updatePersonalPhonenum;
		}
}
