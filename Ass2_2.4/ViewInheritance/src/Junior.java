
public class Junior extends StudentSeniority {

	public Junior(String name, Integer id, String seniority) {
		super(name, id, seniority);
	}

	public Junior(String name, Integer id) {
		super(name, id);
	}

	public String getSeniority(){
		return "Junior";
	}
	
}
