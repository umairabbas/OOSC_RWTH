
public class Freshman extends StudentSeniority {

	public Freshman(String name, Integer id, String seniority) {
		super(name, id, seniority);
	}

	public Freshman(String name, Integer id) {
		super(name, id);
	}

	public String getSeniority(){
		return "Freshman";
	}
	
}
