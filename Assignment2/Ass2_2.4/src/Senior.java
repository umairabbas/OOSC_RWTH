
public class Senior extends StudentSeniority {

	public Senior(String name, Integer id, String seniority) {
		super(name, id, seniority);
	}

	public Senior(String name, Integer id) {
		super(name, id);
	}

	public String getSeniority(){
		return "Senior";
	}
	
}
