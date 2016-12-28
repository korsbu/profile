package DB_Query;

public class QueryDelete {
	private String deletePersonal = "DELETE FROM personal WHERE NUM=?";
	   
	   public String getDeletePersonal() {
	      return deletePersonal;
	   }
}
