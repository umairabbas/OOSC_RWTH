
public class StudentSeniority extends Student{

	private String seniority;
	
	public StudentSeniority(String name, Integer id) {
		super(name, id);
	}

	public StudentSeniority(String name, Integer id, String seniority) {
		super(name, id);
		this.seniority = seniority;
	}

	public String getSeniority() {
		return seniority;
	}

	public void setSeniority(String seniority) {
		this.seniority = seniority;
	}
	
}
