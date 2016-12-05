
public class Regular extends StudentType {

	public Regular(String name, Integer id) {
		super(name, id);
	}

	public Regular(String name, Integer id, String type) {
		super(name, id, type);
	}

	public String getType(){
		return "Regular";
	}

}
