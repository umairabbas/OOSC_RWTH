
public class Sophomore extends StudentSeniority {

	public Sophomore(String name, Integer id, String seniority) {
		super(name, id, seniority);
	}

	public Sophomore(String name, Integer id) {
		super(name, id);
	}

	public String getSeniority(){
		return "Sophomore";
	}
	
}
