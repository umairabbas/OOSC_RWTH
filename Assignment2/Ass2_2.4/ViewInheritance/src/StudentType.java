
public class StudentType extends Student{

	private String type;
	
	public StudentType(String name, Integer id) {
		super(name, id);
	}

	public StudentType(String name, Integer id, String type) {
		super(name, id);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
